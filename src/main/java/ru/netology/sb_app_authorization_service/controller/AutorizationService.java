package ru.netology.sb_app_authorization_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.sb_app_authorization_service.enums.Authorities;
import ru.netology.sb_app_authorization_service.services.AuthorizationService;

import java.util.List;

@RestController
public class AutorizationService {

    @Autowired
    AuthorizationService service;

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@RequestParam("user") String user, @RequestParam("password") String password) {
        return service.getAuthorities(user, password);
    }
}
