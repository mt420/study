package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Hello3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//      1.获取类的工程路径
        System.out.println("URI=>" + request.getRequestURI());
//      2.获取请求的统一资源定位符（绝对路径）
        System.out.println("URL=>"+ request.getRequestURL());
//      3.获取客户端IP地址
        System.out.println("客户端的IP地址: "+ request.getRemoteHost());
//      4.获取请求头
        System.out.println("请求头User-Agent=====》"+ request.getHeader("User-Agent"));
//      5.获取请求的方法 GET  OR POST
        System.out.println("请求的方法是："+ request.getMethod());

    }
}
