package servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ContextServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        1. 获取WEB.XML中配置的上下文参数
        ServletContext servletContext = getServletConfig().getServletContext();
        String username = servletContext.getInitParameter("username");
        System.out.println("context-param的参数username是： "+ username);
        System.out.println("context-param的参数password是： "+ servletContext.getInitParameter("password"));
//        2. 获取当前的工程路径，格式：/工程路径
        System.out.println("当前的工程路径为： " +servletContext.getContextPath());
//        3. 获取部署在服务器硬盘上的绝对路径
        /**
         *   /斜杠被服务器解析地址为：http://ip:port/
         */
        System.out.println("工程部署的路径是："+ servletContext.getRealPath("/"));
        System.out.println("css目录的部署路径是："+ servletContext.getRealPath("/css"));
        System.out.println("favicon.ico文件的部署的路径是："+ servletContext.getRealPath("/img/favicon.ico"));
//        4. 像MAP一样存取数据。ServletContext是工程启动时创建，关闭时销毁。所以web.xml中没有的数据，需要在重启后重新添加
        System.out.println("Context中添加前，获取key1的值为： "+ servletContext.getAttribute("key1"));
        servletContext.setAttribute("key1","value1");
        System.out.println("Context中添加后获取key1的值为： "+ servletContext.getAttribute("key1"));




    }
}
