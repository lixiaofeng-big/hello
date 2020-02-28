package com.service;

import com.dao.UserDao;
import com.entity.User;

import java.util.List;

/**
 * @program: maven-parent
 * @description:
 * @author: admin
 * @create: 2019-09-25 15:52
 **/
public class UserService {
    public List<User> queryAll(){
        UserDao dao = new UserDao();
        return dao.queryAll();
    }
}
