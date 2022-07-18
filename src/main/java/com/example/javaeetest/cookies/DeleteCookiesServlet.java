package com.example.javaeetest.cookies;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class DeleteCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = new Cookie("some_id", ""); // для удаления cookie1 его нужно перезаписать

        cookie.setMaxAge(0); // нулевое значение срока действия, куки удаляются немедленно
        //cookie.setMaxAge(-1); // куки будут удаляться при закрытии браузера
        response.addCookie(cookie);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
