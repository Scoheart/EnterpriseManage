package com.scoheart.service;

import com.scoheart.dao.AdminMapper;
import com.scoheart.pojo.Admin;
import com.scoheart.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;


public class AdminService {

    public Admin selectAdmin(){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

        SqlSession sqlSession = sqlSessionFactory.openSession();
        AdminMapper mapper = sqlSession.getMapper(AdminMapper.class);

        Admin admin = mapper.selectAdmin();

        sqlSession.close();

        return admin;
    }


  /**
   * @MethodName: selectByAdmin
   * @Description: TODO
 * @Param: username
 * @Param: password
   * @Return: com.scoheart.pojo.Admin
   * @Date: 2022/11/5 3:13
   * @Author: Scoheart
   * @Version: 1.0
   **/
  public Admin selectByAdmin(String username, String password){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();

        AdminMapper mapper = sqlSession.getMapper(AdminMapper.class);
        Admin admin = mapper.selectByAdmin(username, password);

        sqlSession.close();
        return admin;
    }

    /**
     * @MethodName: selectByUsername
     * @Description: TODO 根据用户名在service里查用户 如果存在返回的 是假  不存在返回的 是真 用户不存在吗？ 不存在= true 存在= false
     * @Param: admin
     * @Return: java.lang.Boolean
     * @Date: 2022/11/5 3:58
     * @Author: Scoheart
     * @Version: 1.0
     **/
    public Boolean register(Admin admin) {
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();

        AdminMapper mapper = sqlSession.getMapper(AdminMapper.class);
        Admin admin1 = mapper.selectByUsername(admin.getUsername());

        if(admin1 == null){
            mapper.insertAdmin(admin);
            sqlSession.commit();
            return true;
        }

        sqlSession.close();
        return false;
    }
}

/*这里已经完成数据库的事件    增删改查*/