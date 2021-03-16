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
@WebServlet(name = "Ejercicio_3", urlPatterns = {"/Ejercicio_3"})
public class Ejercicio_3 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Saludo de Bienvenida</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<div align='center'>");
             out.println("<h1>Ejercicio #3</h1>");
            out.println("<h2>Calcular Edad en un solo Servelet</h2>");
            out.println("<form action='#' method='post'>");
            out.println("<label>Nombre: </label>");
            out.println("<input type='text' name='nombre'>");

            out.println("<br>");
            out.println("<label>Año de Nacimiento: </label>");
            out.println("<input type='number' name='fecha'>");
            out.println("<br>");
            out.println("<input type='submit' name='procesar'>");

            
            
            out.println("<br>");
            out.println("</form>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }

    }

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

