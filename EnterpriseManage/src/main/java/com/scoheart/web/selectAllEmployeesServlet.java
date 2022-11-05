package com.scoheart.web;

import com.scoheart.pojo.Employees;
import com.scoheart.service.EmployeesService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectAllEmployeesServlet")
public class selectAllEmployeesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EmployeesService employeesService = new EmployeesService();
        List<Employees> employees = employeesService.selectAllEmployees();

        request.setAttribute("employees", employees);

        request.getRequestDispatcher("/employeesInfo.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
