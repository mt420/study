package servlet.test;

import org.junit.Test;
import servlet.pojo.User;
import servlet.service.UserService;
import servlet.service.impl.UserServiceImpl;

import static org.junit.Assert.*;

public class UserServiceTest {

    UserService userService=new UserServiceImpl();

    @Test
    public void registerUser() {
        userService.registerUser(new User(null,"mt1234","asfa","mt@12.com"));

    }

    @Test
    public void login() {
        System.out.println(userService.login(new User(null,"mt123","asfa","mt@12.com")));
    }

    @Test
    public void existUsername() {
        if(userService.existUsername("admin1")){
            System.out.println("用户名已存在");
        }else{
            System.out.println("用户名可用");
        }
    }
}