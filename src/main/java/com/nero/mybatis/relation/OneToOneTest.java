package com.nero.mybatis.relation;

import com.nero.mybatis.relation.domain.pojo.UserIdcard;
import com.nero.mybatis.relation.domain.pojo.UserIdcard2;
import com.nero.mybatis.relation.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class OneToOneTest {
    public static void main(String[] args) throws IOException {
        try {
            //-------------------------使用 XML 构建 SqlSessionFactory-------------------------
            // 读取配置文件 mybatis-config.xml
            InputStream config = Resources
                    .getResourceAsStream("mybatis-config.xml");
            // 根据配置文件构建SqlSessionFactory
            SqlSessionFactory ssf = new SqlSessionFactoryBuilder()
                    .build(config);
            //--------------------------------------------------------

            // 通过 SqlSessionFactory 创建 SqlSession
            SqlSession ss = ssf.openSession();

            //获取Mapper
            UserMapper userMapper = ss.getMapper(UserMapper.class);

            // 一对一关联 查询所有用户-方式一
            List<UserIdcard> userIdcardList = userMapper.getAllUserWithIdcard();
            for (UserIdcard userIdcard : userIdcardList) {
                System.out.println(userIdcard);
            }

            // 一对一关联 查询所有用户-方式二
            List<UserIdcard> userIdcardList2 = userMapper.getAllUserWithIdcard2();
            for (UserIdcard userIdcard : userIdcardList2) {
                System.out.println(userIdcard);
            }

            // 一对一关联 查询所有用户-方式三
            List<UserIdcard2> userList3 = userMapper.getAllUserWithIdcard3();
            for (UserIdcard2 user : userList3) {
                System.out.println(user);
            }

            // 提交事务
            ss.commit();
            // 关闭 SqlSession
            ss.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
