package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ResponseIOServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置服务器字符集
//        response.setCharacterEncoding("UTF-8");

        //通过响应头，设置浏览器字符集
//        response.setHeader("Content-Type","text/html; charset=UTF-8");
        //一条命令设置了服务器的字符集，和浏览器的字头与字符集
        //此方法一定要在获取流之前设置
        response.setContentType("text/html; charset=UTF-8");

        PrintWriter writer = response.getWriter();
        writer.print(response.getCharacterEncoding()+"<br/>");

        writer.write("穆童很帅");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
