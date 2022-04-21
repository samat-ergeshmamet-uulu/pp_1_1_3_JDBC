package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserService userService=new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Aleksey", "Sidorov", (byte) 20);
        userService.saveUser("Vladimir", "Golovach", (byte) 34);
        userService.saveUser("Anatoliy", "Kozlov", (byte) 40);
        userService.saveUser("Ivan", "Golovin", (byte) 10);

        userService.getAllUsers();

        userService.cleanUsersTable();
        userService.dropUsersTable();

        Util.closeConnection();
    }
}
