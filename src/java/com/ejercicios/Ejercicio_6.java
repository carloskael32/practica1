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
@WebServlet(name = "Ejercicio_6", urlPatterns = {"/Ejercicio_6"})
public class Ejercicio_6 extends HttpServlet {

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
            out.println("<h1>Ejercicio #6</h1>");
            out.println("<h2>Juego de Dados</h2>");
            out.println("<br>");

            out.println("<br>");

            out.println("<input type='submit' onClick='document.location.reload();' name='procesar' value='Lanzar los Dados'>");
            out.println("<br>");
            out.println("<br>");
           
            
            int d1 = (int) (Math.random() * 6 + 1);
            out.println("Dado #1 = " + d1);
            out.println("<br>");
            out.println("<br>");
            out.println("<br>");

            int d2 = (int) (Math.random() * 6 + 1);
            out.println("Dado #2 = " + d2);
            out.println("<br>");
            out.println("<br>");

            int suma = d1 + d2;

            if (suma == 7) {
                out.println("Resultado de la suma de los dados: "+suma);
                out.println("<h1>Perdiste!!!</h1>");
                
            } else {
                out.println("Resultado de la suma de los dados: "+suma);
                out.println("<h1>Ganaste!!!</h1>");
                
            }
                out.println("<br>");

                  out.println("<a href='Principal'>volver al inicio");

            out.println("</div>");
            out.println("</body>");
            out.println("</html>");

        }

    }

   

}
