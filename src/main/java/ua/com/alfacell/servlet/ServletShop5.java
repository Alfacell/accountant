package ua.com.alfacell.servlet;

import ua.com.alfacell.dto.StorageDto;
import ua.com.alfacell.models.Storage;
import ua.com.alfacell.service.StorageService;
import ua.com.alfacell.utilites.WebRedirect;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/shop5")
public class ServletShop5 extends WebRedirect {
    int shopId = 5;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        redirectShop(req, resp, shopId);
    }
}
