package com.dao;

import com.entity.User;
import com.utils.Druids;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @program: maven-parent
 * @description:
 * @author: admin
 * @create: 2019-09-25 15:49
 **/
public class UserDao {
    public List<User> queryAll(){
        QueryRunner runner = new QueryRunner(Druids.getDataSource(),true);
        BeanListHandler<User> handler = new BeanListHandler<>(User.class);
        String sql = "select id,name,salary from user";
        List<User> result=null;
        try {
            result = runner.query(sql,handler);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
