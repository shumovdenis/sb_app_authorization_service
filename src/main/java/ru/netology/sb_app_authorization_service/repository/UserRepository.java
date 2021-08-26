package ru.netology.sb_app_authorization_service.repository;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
import ru.netology.sb_app_authorization_service.entity.User;
import ru.netology.sb_app_authorization_service.enums.Authorities;

import java.util.Collections;
import java.util.List;


@Repository
@Configuration
@ConfigurationProperties(prefix = "user-list")
public class UserRepository {
    private List<User> users;

    public List<Authorities> getUserAuthorities(String user, String password) {
        for (User u : users) {
            if(u.getName().equals(user) && u.getPassword().equals(password))
                return u.getPermissions();
        }
        return Collections.emptyList();
    }
}
