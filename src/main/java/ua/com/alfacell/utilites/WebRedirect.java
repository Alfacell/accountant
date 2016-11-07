package ua.com.alfacell.utilites;

// Created by Ponomarenko Oleh on 07.11.2016.

import ua.com.alfacell.dto.StorageDto;
import ua.com.alfacell.service.StorageService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class WebRedirect extends HttpServlet {
    public void redirectShop(HttpServletRequest req, HttpServletResponse resp, int shopId) throws ServletException, IOException {
        if (req.getSession().getAttribute("user") != null) {
            List<StorageDto> storageList = new StorageService().findProductsByShopId(shopId);
            req.getSession().setAttribute("storageList" + shopId, storageList);
            req.getSession().setAttribute("shopId", shopId);
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/pages/shop" + shopId + ".jsp");
            rd.forward(req, resp);
        } else {
            resp.sendRedirect("/login");
        }
    }
}
