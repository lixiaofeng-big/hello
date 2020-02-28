package com.web;

import com.entity.User;
import com.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @program: maven-parent
 * @description:
 * @author: admin
 * @create: 2019-09-25 15:56
 **/
@WebServlet("/user")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserService service = new UserService();
        List<User> users = service.queryAll();
        req.setAttribute("users",users);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
