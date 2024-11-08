package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {

    public static void main(String[] args) {
        UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();
        userDaoHibernate.createUsersTable();
        userDaoHibernate.saveUser("Антон", "Антонов", (byte) 22);
        userDaoHibernate.saveUser("Лев", "Шишкин", (byte) 23);
        userDaoHibernate.saveUser("Анастасия", "Заворотнюк", (byte) 45);
        userDaoHibernate.saveUser("Максим", "Михалков", (byte) 54);

        userDaoHibernate.getAllUsers();

        userDaoHibernate.cleanUsersTable();

        userDaoHibernate.dropUsersTable();
//        UserServiceImpl userService = new UserServiceImpl();
//        userService.createUsersTable();

//        userService.saveUser("Антон", "Антонов", (byte) 22);
//        userService.saveUser("Лев", "Шишкин", (byte) 23);
//        userService.saveUser("Анастасия", "Заворотнюк", (byte) 45);
//        userService.saveUser("Максим", "Михалков", (byte) 54);

//        userService.getAllUsers();
//
//        userService.cleanUsersTable();
//
//        userService.dropUsersTable();
    }
}
