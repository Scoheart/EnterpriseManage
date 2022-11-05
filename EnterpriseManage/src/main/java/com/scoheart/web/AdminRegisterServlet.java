package com.scoheart.web;

import com.scoheart.pojo.Admin;
import com.scoheart.service.AdminService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AdminRegisterServlet", value = "/AdminRegisterServlet")
public class AdminRegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Admin admin = new Admin();
        admin.setUsername(username);
        admin.setPassword(password);

        AdminService adminService = new AdminService();
        Boolean aBoolean = adminService.register(admin);

//不存在为真 为真表示注册完成
        if(aBoolean){
            request.setAttribute("register_msg", "注册成功, 请登录");
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }
        else {
            request.setAttribute("register_msg", "注册失败，用户名已经存在");
            request.getRequestDispatcher("/register.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
