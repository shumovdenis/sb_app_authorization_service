package ru.netology.sb_app_authorization_service.entity;

import ru.netology.sb_app_authorization_service.enums.Authorities;

import java.util.List;

public class User {
    private String name;
    private String password;
    private List<Authorities> permissions;

    public User(String name, String password, List<Authorities> permissions) {
        this.name = name;
        this.password = password;
        this.permissions = permissions;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "Пользователь: " +
                "Имя: '" + name + '\'' +
                ", Пароль: '" + password + '\'' +
                ", Права: " + permissions +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Authorities> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Authorities> permissions) {
        this.permissions = permissions;
    }

}
