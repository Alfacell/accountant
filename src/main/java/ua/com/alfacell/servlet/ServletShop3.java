package ua.com.alfacell.servlet;
import ua.com.alfacell.utilites.WebRedirect;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/shop3")
public class ServletShop3 extends WebRedirect {
    int shopId = 3;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        redirectShop(req, resp, shopId);
    }
}
