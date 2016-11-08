package ua.com.alfacell.servlet;

import ua.com.alfacell.dao.impl.UserDaoImpl;
import ua.com.alfacell.models.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class ServletAuthentication extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String login = req.getParameter("login");
        System.out.println(login);
        String password = req.getParameter("password");
        System.out.println(password);
        User user = new User();
        user.setLogin(login);
        user.setPassword(password);
        if (new UserDaoImpl().findByLoginPassword(login, password) != null) {
            user = new UserDaoImpl().findByLoginPassword(login, password);
            HttpSession httpSession = req.getSession();
            httpSession.setAttribute("user", user);

            resp.sendRedirect("/home");

        } else {
            resp.sendRedirect("/login");

        }

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/pages/login.jsp");
        rd.forward(req, resp);
     /*   PrintWriter out = resp.getWriter();
        out.println("<font color=\"red\">Username or Password incorrect</font>");
        RequestDispatcher rs = req.getRequestDispatcher("/login.jsp");
        rs.include(req, resp);*/
    }
}
