package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;
import web.service.CarService;
import java.util.List;

@Controller
public class CarsController {

    private CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String getCars(Integer count, Model model) {
        List<Car> cars= carService.getCars
                (count != null ? count : Integer.MAX_VALUE);
        model.addAttribute("cars", cars);
        return "cars";
    }


}
