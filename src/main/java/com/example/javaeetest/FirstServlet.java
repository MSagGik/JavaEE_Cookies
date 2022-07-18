package com.example.javaeetest;

import com.example.javaeetest.logic.somePackage.Cart;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;


public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession(); // получение объекта сессии для текущего запроса

        String user = (String) session.getAttribute("current_user");

        if (user == null) {
            // response для анонимного пользователя
            // авторизация
            // регистрация
            // session.setAttribute("current_user", ID);
        } else {
            // response для авторизованного пользователя
        }
        
//        Cart cart = (Cart) session.getAttribute("cart");
//
//        String name = request.getParameter("name");
//        int quantity = Integer.parseInt(request.getParameter("quantity"));
//
//        if (cart == null) {
//            cart = new Cart();
//            cart.setName(name);
//            cart.setQuantity(quantity);
//        }
//
//        session.setAttribute("cart",cart); // открытие сессии


//        PrintWriter pw = response.getWriter();
//
//        pw.println("<html>");
//        pw.println("<h1> Your count is: " + count + " </h1>");
//        pw.println("</html>");

        getServletContext().getRequestDispatcher("/showCart.jsp").forward(request, response); // перенаправление на jsp

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
