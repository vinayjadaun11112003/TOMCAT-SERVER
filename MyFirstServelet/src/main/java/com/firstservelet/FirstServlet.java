package com.firstservelet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html lang='en'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.println("<title>First Servlet Route</title>");
        out.println("<link href='https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600&display=swap' rel='stylesheet'>");
        out.println("<style>");
        out.println("body {");
        out.println("    font-family: 'Poppins', sans-serif;");
        out.println("    background: linear-gradient(135deg, #1e3c72, #2a5298);");
        out.println("    color: white;");
        out.println("    display: flex;");
        out.println("    justify-content: center;");
        out.println("    align-items: center;");
        out.println("    height: 100vh;");
        out.println("    margin: 0;");
        out.println("}");
        out.println(".container {");
        out.println("    background: rgba(255, 255, 255, 0.1);");
        out.println("    padding: 40px;");
        out.println("    border-radius: 10px;");
        out.println("    box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.2);");
        out.println("    text-align: center;");
        out.println("}");
        out.println("h3 { font-size: 2rem; font-weight: 600; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        out.println("<h3>Hello, This is the first route I have created!</h3>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");

        out.close();
    }

}

