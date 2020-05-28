package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取办事的材料
        String username = request.getParameter("username");
        System.out.println("自带的参数为"+username);

        //看是否有办事处1的章
        Object key1 = request.getAttribute("key1");
        System.out.println("柜台1是否有章"+key1);

        //处理自己的业务
        System.out.println("柜台2 的业务");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
