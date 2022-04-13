import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(name = "FirstServlet", urlPatterns = "/firstServlet") // та часть пути по которому обращаемся к сервлету
public class FirstServlet implements Servlet {

    private transient ServletConfig servletConfig;
    private static Logger logger = LoggerFactory.getLogger(FirstServlet.class);

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig = servletConfig;
    }

    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException { //Request - входящий запрос, Response - Исходящий запрос
        logger.info("New request");
        servletResponse.getWriter().println("<h1> My first servlet!</h1>");
        logger.info("Request close");
    }

    @Override
    public String getServletInfo() {
        return "FirstServlet";
    }

    @Override
    public void destroy() {//используется тогда когда сервлет прекращает жить
        logger.info("Destroyed");
    }
}
