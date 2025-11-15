package com.dzh.controller;

import cn.hutool.core.io.IoUtil;
import com.dzh.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * User information controller
 */
@RestController//
public class UserController {

    @RequestMapping("/list")
    public List<User> list() throws Exception {
        //1.load user.text, get user data
//this way to transfer path is not good         InputStream in = new FileInputStream(new File("E:\\GoogleDownload\\demo\\springboot-web-01\\src\\main\\resources\\user.txt"));
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("user.txt");
        ArrayList<String> lines = IoUtil.readLines(in , StandardCharsets.UTF_8 , new ArrayList<>() );


        //2.analyze info, and encapsulate it as a user object, named list collection.
        List<User> userList = lines.stream().map(line -> {
            String[] parts = line.split(",");
            Integer id = Integer.parseInt(parts[0]);
            String username = parts[1];
            String password = parts[2];
            String name = parts[3];
            Integer age = Integer.parseInt(parts[4]);
            LocalDateTime updateTime = LocalDateTime.parse(parts[5], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            return new User(id, username, password, name, age, updateTime);
        }).toList();

        //3.return data to frontend  (json)
        return userList;
    }
}
