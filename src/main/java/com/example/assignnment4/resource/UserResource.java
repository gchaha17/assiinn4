package com.example.assignnment4.resource;

import com.example.assignnment4.exception.RestrictedInfo;
import com.example.assignnment4.model.User;
import com.example.assignnment4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserResource {
    @Autowired
    public UserService u2;

    @PostMapping("/user")
    public User saveUser(@RequestBody @Valid User u1) {
        return u2.saveUser(u1);

    }

    @GetMapping("/user")
    public List<User> getUser() {
        return u2.getUser();

    }

    @PutMapping("/user")
    public User updateUser(@RequestBody User u1) {

        return u2.updateUser(u1);
    }

    @DeleteMapping
    public void deleteUser(@RequestParam(name = "userId") String userId) {
        u2.deleteUser(userId);

    }
    @GetMapping("/find")
    public List<User> getuserByName(@RequestParam (name="name") String name) throws RestrictedInfo {
        if (name.equalsIgnoreCase("root")) {
            throw new RestrictedInfo();



        }
        return u2.getuserByName(name);
    }
}