package com.example.javaeetest.cookies;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class GetCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies(); // Берём запрос от клиента и методом геткуки получаем куки от клиента

        PrintWriter pw = response.getWriter();

        pw.println("<html>");

        for (Cookie cookie: cookies)
            // отображение у пользователя его куки
            pw.println("<h1>" + cookie.getName() + " : " + cookie.getValue() + "</h1>");

        pw.println("</html>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
