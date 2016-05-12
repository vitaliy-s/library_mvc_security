package ua.sosna.logics;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by vitaliy on 12.05.16.
 */
public class BCrypt {

    public static String bCrypt(String password, int count) {

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(count);
        return passwordEncoder.encode(password);

    }

    public static String bCrypt(String password) {

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.encode(password);

    }
}
