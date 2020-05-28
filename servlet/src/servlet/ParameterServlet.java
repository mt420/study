package servlet;

import sun.text.normalizer.UTF16;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;


public class ParameterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String []hobby = req.getParameterValues("hobby");
        System.out.println("用户名"+username+"密码"+password+"兴趣爱好"+ Arrays.asList(hobby));
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //获取请求参数
        req.setCharacterEncoding("UTF-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String []hobby = req.getParameterValues("hobby");
        System.out.println("用户名"+username+"密码"+password+"兴趣爱好"+ Arrays.asList(hobby));
    }
}
