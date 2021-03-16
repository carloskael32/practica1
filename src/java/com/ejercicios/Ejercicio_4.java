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
@WebServlet(name = "Ejercicio_4", urlPatterns = {"/Ejercicio_4"})
public class Ejercicio_4 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Ejercicio #4</title>");
            out.println("</head>");
            out.println("<body>");

            out.println("<div align='center'>");
            out.println("<h1>Ejercicio #4</h1>");
            out.println("<h2>Cambio de moneda</h2>");
            out.println("<br>");

            out.println("<form action='#' method='post'>");

            out.println("<br>");
            out.println("<label>Ingrese la Cantidad: </label>");
            out.println("<input type='number' name='mon'>");
         
          
            out.println(" <select name='select'>");
            out.println(" <option value='1'>Bolivianos a Dolares</option>");
            out.println("<option value='2'>Dolares a Bolivianos</option>");
            out.println("</select>");

            out.println("<br>");
            out.println("<br>");
              out.println("<input type='submit' name='procesar'>");

            out.println("</form>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int va = Integer.parseInt(request.getParameter("select"));
        
        double mon =0;
        double b=0;
        
      if(va != 1){
           mon = Integer.parseInt(request.getParameter("mon"));
            b = mon;
              mon = mon * 6.95;
      }else{
             mon = Integer.parseInt(request.getParameter("mon"));
                 b = mon;
              mon = mon / 6.97;
      }
        
           
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
            if(va !=1){
            out.println("<p>" +b+ " Bolivianos.. </p>");  
             out.println("<p>El monto en Dolares es: " +mon + " </p>");
            }else{
                 out.println("<p> "+b+" Dolares.. </p>");  
             out.println("<p>El monto en Bolivianos es: " +mon + " </p>");
            }
                
                    
            
      
           
            out.println("<a href='Principal'>volver al inicio");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }

    }

}
