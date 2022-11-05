package com.scoheart.service;

import com.scoheart.dao.EmployeesMapper;
import com.scoheart.pojo.Employees;
import com.scoheart.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class EmployeesService {

    public List<Employees> selectAllEmployees(){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmployeesMapper mapper = sqlSession.getMapper(EmployeesMapper.class);
        List<Employees> employees = mapper.selectAllEmployees();
        sqlSession.close();

        return employees;
    }
}
