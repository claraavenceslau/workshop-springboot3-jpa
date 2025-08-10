package com.educandoweb.course.resource;

import com.educandoweb.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserResource {

    @GetMapping(value = "/users")
    public ResponseEntity<User> findAllUsers() {
        User u =   new User(1L, "Juliana", "juliana@gmail.com", "99999", "159873");
    return  ResponseEntity.ok().body(u);}


}
