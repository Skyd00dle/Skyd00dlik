package web.config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.config.model.User;
import web.config.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String showAllUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "users";
    }

    @GetMapping("/addNewUser")
    public String addUserForm(Model model) {
        model.addAttribute("user", new User());
        return "useractions";
    }

    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") User user) {
        if (user.getId() == 0) {
            userService.addUser(user);
        } else {
            userService.updateUser(user);
        }
            return "redirect:/users/";
    }

    @PostMapping("/updateUser/{id}")
    public String updateUser(@PathVariable("id") int id, Model model) {
        User user = (User) userService.getUserById(id);
        model.addAttribute("user", user);
        return "useractions";
    }

    @PostMapping("/removeUser/{id}")
    public String removeUser(@PathVariable("id") int id) {
        userService.removeUser(id);
        return "redirect:/users/";
    }

}

