package edu.grossmont;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TestServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{

        String sUsername = request.getParameter("username");
        String sPassword = request.getParameter("password");

        PrintWriter out = response.getWriter();

        out.println("Servlet Working!");
        out.println("username: " + sPassword);
        out.println("password: " + sUsername);

    }

}
