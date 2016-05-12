package ua.sosna.dao;

import ua.sosna.model.User;

import java.util.List;

/**
 * Created by vitaliy on 12.05.16.
 */
public interface UserDAO {

    List<User> allUser();

    void deleteUser(int userId);

    User get(int userId);

    void saveUser(User user);

    void updateUser(User user);
}
