package com.leo.springboot2book.service.impl;

import com.leo.springboot2book.entity.User;
import com.leo.springboot2book.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<User> getAllUser() {
        return sampleUsers(5);
    }

    private List<User> sampleUsers(int num) {

        ArrayList<User> users = new ArrayList<>(num);

        for (int j = 0; j < num; j++) {
            User user = new User();
            user.setId((long) j);
            user.setName("name" + j);
            users.add(user);
        }

        return users;

    }

    @Override
    public User getUserById(long id) {
        User user = sampleUsers((int) id).get(0);
        user.setId(id);
        return user;
    }

    @Override
    public void updateUser(long id, int type) {
    }
}


