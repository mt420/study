package servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Hello2 extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
//        必须保留这个super，以运行父类init的方法，调用config文件
        super.init(config);
        System.out.println("我做了一些工作");
    }

    /**
     * 在get请求时调用
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        System.out.println("Hello2 的 get 方法");
    }
    /**
     * 在post请求时调用
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        System.out.println("Hello2 的 post 方法");
    }
}
