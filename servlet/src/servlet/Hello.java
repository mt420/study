package servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class Hello implements Servlet {

    public Hello() {
        System.out.println("1, constructor");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("2, init");

//        1. 可以获取Servlet程序的别名servlet-name的值
        System.out.println("Hello程序的别名是："+ servletConfig.getServletName());
//        2. 获取初始化参数init-param
        System.out.println("初始化参数username的值是："+servletConfig.getInitParameter("username"));
        System.out.println("初始化参数url的值是："+servletConfig.getInitParameter("url"));
//        3. 获取ServletContext对象
        System.out.println(servletConfig.getServletContext());


    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     *
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("3, service, Hello Servlet");

        //        类型转换,因为它有getMethod方法
        HttpServletRequest httpServletRequest= (HttpServletRequest) servletRequest;
        String method=httpServletRequest.getMethod();
        System.out.println(method);
        if("GET".equals(method)){
            doGet();
        }
        else if("POST".equals(method)){
            doPost();
        }


    }
    public void doGet(){
        System.out.println("get request");
    }
    public void doPost(){
        System.out.println("post request");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("4, destroy");

    }
}
