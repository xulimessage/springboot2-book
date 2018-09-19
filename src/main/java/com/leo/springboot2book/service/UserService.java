package com.leo.springboot2book.service;

import com.leo.springboot2book.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
public interface UserService {
    //获取所有用户
    public List<User> getAllUser();

    //获取用户
    public User getUserById(long id);

    //更新用户
    public void updateUser(long id, int type);


}
