package com.scoheart.dao;

import com.scoheart.pojo.Employees;

import java.util.List;

public interface EmployeesMapper {
    List<Employees> selectAllEmployees();
}
