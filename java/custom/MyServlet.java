package custom;

import org.apache.catalina.connector.RequestFacade;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author Wang Yuanye
 * @version v1.0
 * @apiNote 自定义servlet
 * @date : 2021/3/2 下午2:38
 **/
public class MyServlet implements Servlet {
    @Override
    public void init(ServletConfig config) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String name = req.getParameter("name");
        RequestFacade facade = (RequestFacade) req;
        // 获取请求方式
        String type = facade.getMethod();
        // 获取header中的kv
        String method = facade.getHeader("method");
        res.getWriter().write("hello, "+name +";method:"+type);
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
