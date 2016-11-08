package ua.com.alfacell.servlet;

import ua.com.alfacell.dto.StorageDto;
import ua.com.alfacell.service.StorageService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/allShops")
public class ServletAllShops extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getSession().getAttribute("user") != null) {
            List<StorageDto> storageList = new StorageService().findAll();
            req.getSession().setAttribute("storageList", storageList);
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/pages/allShops.jsp");
            rd.forward(req, resp);
        } else {
            resp.sendRedirect("/login");
        }
    }
}
