package org.example.user.service;

import java.util.List;

import org.example.user.entity.User;
import org.example.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yourname <yourname>
 * Created on 2024-04-22
 */
@Service
public class UserServiceImpl {
    @Autowired
    private UserMapper userMapper;

    /**
     * 新增user
     */
    public void insertUser(User user) {
        userMapper.insert(user);
    }

    /**
     * 通过userId删除user
     */
    public void delUser(String userId) {
        userMapper.deleteById(userId);
    }

    /**
     * 通过userId修改user
     */
    public void updateUser(User user) {
        userMapper.updateById(user);
    }

    /**
     * 获取所有user
     */
    public List<User> getUser() {
        List<User> users = userMapper.selectList(null);
        return users;
    }

}