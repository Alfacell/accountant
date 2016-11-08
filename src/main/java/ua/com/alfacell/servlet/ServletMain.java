package ua.com.alfacell.servlet;

import ua.com.alfacell.models.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/home")
public class ServletMain extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession httpSession = req.getSession();
        User user = (User) httpSession.getAttribute("user");
        if (user == null) {
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/login");
            rd.forward(req, resp);
        }

        resp.sendRedirect("/shop" + user.getShop().getId());
    }
}
