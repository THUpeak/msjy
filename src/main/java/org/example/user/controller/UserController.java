package org.example.user.controller;

import java.util.List;

import org.example.user.entity.User;
import org.example.user.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yourname <yourname>
 */
@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    /**
     * 查询所有
     */
    @GetMapping
    List<User> getAll(){
        List<User> user = userService.getUser();
        return user;
    }

    /**
     * 新增
     */
    @PostMapping
    void add(@RequestBody User user){
        userService.insertUser(user);
    }

    /**
     * 修改
     */
    @PutMapping
    void update(@RequestBody User user){
        userService.updateUser(user);
    }

    /**
     * 通过id删除
     */
    @DeleteMapping
    void deleteById(@RequestBody User user){
        userService.delUser(user.getUserid());
    }
}

//测试