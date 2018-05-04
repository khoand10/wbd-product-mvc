package controller;

import service.ServiceProduct;
import service.ServiceProductImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletSearch",urlPatterns = "/product_search")
public class ServletSearch extends HttpServlet {
    ServiceProduct service = new ServiceProductImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
        String name = request.getParameter("key");
        request.setAttribute("products",service.findByName(name));
        requestDispatcher.forward(request,response);
    }
}
