package com.example.assignnment4.service;

import com.example.assignnment4.model.User;
import com.example.assignnment4.repoistery.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo u3;


    public User saveUser(User u1) {
        return u3.save(u1);

    }


    public List<User> getUser() {
        return u3.findAll();

    }

    public User updateUser(User u1) {
        return u3.save(u1);
    }

    public void deleteUser(String userId) {
        u3.deleteById(userId);
    }

    public List<User> getuserByName(String name) {
        return u3.findAllByName(name);
    }
}