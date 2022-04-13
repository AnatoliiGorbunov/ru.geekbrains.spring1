import Product.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@WebServlet(name = "SecondServlet", urlPatterns = "/second_servlet")
public class SecondServlet extends HttpServlet{//Здесь не нужен конфиг Http все это уже сделал

    private static Logger logger = LoggerFactory.getLogger(SecondServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info(req.getPathInfo());
        logger.info(req.getContextPath());
        logger.info(req.getMethod());
        logger.info(req.getRequestURI());

        resp.getWriter().println(req.getPathInfo() + req.getContextPath() + req.getMethod() + req.getRequestURI());


        List<Product> product = new ArrayList<>();
        product.add(new Product(1,"bread",30));
        product.add(new Product(2,"Milk",40));
        product.add(new Product(3,"Orange",50));
        product.add(new Product(4,"Butter",60));
        product.add(new Product(5,"Carrot",700));
        product.add(new Product(6,"Coffee",380));
        product.add(new Product(7,"Bananas",3));
        product.add(new Product(8,"Tomato",320));
        product.add(new Product(9,"Tea",310));
        product.add(new Product(10,"Apples",370));
        resp.getWriter().println(product);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
