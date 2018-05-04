package controller;

import bean.Product;
import service.ServiceProduct;
import service.ServiceProductImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletProduct", urlPatterns = "/product")
public class ServletProduct extends HttpServlet {
    ServiceProduct service = new ServiceProductImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");

        if (action == null) {
            action = "";
        }
        switch (action) {
            case "edit":
                int id_edit = Integer.parseInt(request.getParameter("id"));
                request.setAttribute("product", service.info(id_edit));
                break;
            case "delete":
                int id_delete = Integer.parseInt(request.getParameter("id"));
                service.delete(id_delete);
                break;
            case "create":
                int id = Integer.parseInt(request.getParameter("id"));
                String name = request.getParameter("name");
                int price = Integer.parseInt(request.getParameter("price"));
                String depcription = request.getParameter("depcription");
                String made = request.getParameter("made");
                if (service.info(id) == null) {
                    service.create(new Product(id, name, price, depcription, made));
                } else {
                    service.update(id, new Product(id, name, price, depcription, made));
                }
                break;
            case "info":
                int id_detail = Integer.parseInt(request.getParameter("id"));
                request.setAttribute("product_detail", service.info(id_detail));
                requestDispatcher = request.getRequestDispatcher("product_detail.jsp");
                break;
            default:
                request.setAttribute("products", service.getAll());

        }
        if (!action.equals("")) request.setAttribute("products", service.getAll());
        requestDispatcher.forward(request, response);
    }
}
