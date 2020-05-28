package servlet.test;

import org.junit.Test;
import servlet.dao.UserDao;
import servlet.dao.impl.UserDaoImpl;
import servlet.pojo.User;

import static org.junit.Assert.*;

public class UserDaoTest {

    UserDao userDao=new UserDaoImpl();
    @Test
    public void queryUserByUsername() {

        if(userDao.queryUserByUsername("admin12")==null){
            System.out.println("用户名可用");}
        else {
            System.out.println("用户名已存在");
        };
    }

    @Test
    public void queryUserByUsernameAndPassword() {

        if(userDao.queryUserByUsernameAndPassword("admin","admin")==null){
            System.out.println("用户名或密码错误，登陆失败");}
        else {
            System.out.println("登陆成功");
        };
    }


    @Test
    public void saveUser() {
        System.out.println(userDao.saveUser(new User(null,"mt123","asfa","mt@12.com")));
    }
}