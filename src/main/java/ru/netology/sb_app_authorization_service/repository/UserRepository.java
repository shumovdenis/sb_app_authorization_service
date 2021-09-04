package ru.netology.sb_app_authorization_service.repository;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
import ru.netology.sb_app_authorization_service.entity.User;
import ru.netology.sb_app_authorization_service.enums.Authorities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Repository
@Configuration
@ConfigurationProperties(prefix = "user-list")
public class UserRepository {
    private List<User> users;

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> list = new ArrayList<>();
        for (User u : users) {
            if(u.getName().equals(user) && u.getPassword().equals(password)) {
                list = u.getPermissions();
                return list;
            }
        }
        return list;
    }
}
