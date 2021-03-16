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
@WebServlet(name = "Ejercicio_5", urlPatterns = {"/Ejercicio_5"})
public class Ejercicio_5 extends HttpServlet {

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
            out.println("<h1>Ejercicio #5</h1>");
            out.println("<h2>Operaciones Aritmeticas</h2>");
            out.println("<br>");

            out.println("<form action='#' method='post'>");

            out.println("<br>");
            out.println("<label>Primer Numero: </label>");
            out.println("<input type='number' name='a'>");

            out.println("<br>");
            out.println("<label>Segundo Numero: </label>");
            out.println("<input type='number' name='b'>");
            out.println("<br>");
            out.println("<br>");

            out.println("<label>Selecciones la Operacion:  </label>");

            out.println(" <select name='select'>");

            out.println(" <option value='1'>Suma</option>");
            out.println("<option value='2'>Resta</option>");
            out.println("<option value='3'>Multiplicacion</option>");
            out.println("<option value='4'>Division</option>");

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

        int a = Integer.parseInt(request.getParameter("a"));
        int b = Integer.parseInt(request.getParameter("b"));
        
        int op = Integer.parseInt(request.getParameter("select"));
        
        int su = 0;
        int re = 0;
        int mu = 0;
        int di = 0;

        if (op == 1) {
            su = a+b;
        }else if(op == 2){
            re = a-b;
        }else if (op ==3){
            mu = a*b;
        }else{
            di = a/ b;
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
            
            
        if (op == 1) {
            out.println("<h1>SUMA</h1>");
            out.println("La Suma es :");
            su = a+b;
            out.println(su);
        }else if(op == 2){
            out.println("<h1>RESTA</h1>");
            out.println("La Resta es :");
            re = a-b;
             out.println(re);
        }else if (op ==3){
            out.println("<h1>MULTIPLICACION</h1>");
            out.println("La Multiplicacion es :");
            mu = a*b;
             out.println(mu);
        }else{
            out.println("<h1>DIVISION</h1>");
            out.println("La Division es :");
            di = a/ b;
             out.println(di);
        }

          out.println("<br>");
          out.println("<br>");
            out.println("<a href='Principal'>volver al inicio");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }

    }

}
