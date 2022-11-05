package com.scoheart.web;

import com.scoheart.pojo.Admin;
import com.scoheart.service.AdminService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AdminLoginServlet", value = "/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        String remember = request.getParameter("remember");

        AdminService adminService = new AdminService();
        Admin admin = adminService.selectByAdmin(username, password);

        if(admin != null){

            if("1".equals(remember)){
                Cookie username1 = new Cookie("username", username);
                Cookie password1 = new Cookie("password", password);

                username1.setMaxAge(60* 60* 24* 7);
                password1.setMaxAge(60* 60* 24* 7);

                response.addCookie(username1);
                response.addCookie(password1);
            }

            HttpSession session = request.getSession();
            session.setAttribute("admin", admin);

            String contextPath = request.getContextPath();
            response.sendRedirect(contextPath+"/select.jsp");

//            response.sendRedirect("/EnterpriseManage/select.jsp");

//            request.setAttribute("admin", admin);
//            request.getRequestDispatcher("/select.jsp").forward(request,response);
        }
        else {
            request.setAttribute("login_msg", "用户名或密码错误，请重新输入");
            request.getRequestDispatcher("/index.jsp").forward(request,response);

        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
