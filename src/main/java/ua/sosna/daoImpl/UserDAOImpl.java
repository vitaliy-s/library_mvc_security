package ua.sosna.daoImpl;

import org.springframework.jdbc.core.JdbcTemplate;
import ua.sosna.dao.UserDAO;
import ua.sosna.model.User;
import ua.sosna.role_users.UserRole;

import javax.sql.DataSource;
import java.util.List;

import static ua.sosna.logics.BCrypt.bCrypt;

/**
 * Created by vitaliy on 12.05.16.
 */

public class UserDAOImpl implements UserDAO {

    private JdbcTemplate jdbcTemplate;

    public UserDAOImpl(DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<User> allUser() {
        String sql = "";


        return null;
    }

    @Override
    public void deleteUser(int userId) {

    }

    @Override
    public User get(int userId) {
        return null;
    }

    @Override
    public void saveUser(User user) {

        String sql = "INSERT INTO users (username, password, enabled, mail) VALUES (?,?,?,?)";
        jdbcTemplate.update(sql, user.getName(), bCrypt(user.getPassword(),6), user.getEnabled(), user.getMail());

        String sqlRole = "INSERT INTO user_role (username, role_user) VALUES (?,?)";
        jdbcTemplate.update(sqlRole, user.getName(), UserRole.ROLE_USER.toString());
    }

    @Override
    public void updateUser(User user) {

    }
}
