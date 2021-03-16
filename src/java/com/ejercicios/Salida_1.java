/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejercicios;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author carlos
 */
@WebServlet(name = "Salida_1", urlPatterns = {"/Salida_1"})
public class Salida_1 extends HttpServlet {

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        int fecha = Integer.parseInt(request.getParameter("fecha"));
        
        fecha = 2021 - fecha;
        
       response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title> Salida</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<div align='center'>");
            out.println("<h1>Datos Recividos</h1>");
            out.println("<p>Los datos recibidos son... </p>");
            out.println("<p>Nombre: "+nombre+" </p>");
          
            out.println("<p>Edad: "+fecha+" </p>");
            out.println("<a href='Principal'>volver al inicio");
                out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
    }

  

}
