package ua.sosna.test;

import ua.sosna.logics.BCrypt;
import ua.sosna.role_users.UserRole;

import static ua.sosna.logics.BCrypt.bCrypt;

/**
 * Created by vitaliy on 12.05.16.
 */
public class Main {

    public static void main(String[] args) {

       // System.out.println(bCrypt("123"));
        System.out.println(UserRole.ROLE_ADMIN);

    }
}
