package com.imc.mavenproject1.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import model.ModelIMC;

@WebServlet("/imc")
public class IMCController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pesoStr = req.getParameter("peso");
        String alturaStr = req.getParameter("altura");
        if (pesoStr == null || pesoStr.isEmpty()){
            req.setAttribute("message", "Preencha todos os campos");
            req.getRequestDispatcher("index.jsp").forward(req, resp);
            return;
        }
        if (alturaStr == null || alturaStr.isEmpty()){
            req.setAttribute("message", "Preencha todos os campos");
            req.getRequestDispatcher("index.jsp").forward(req, resp);
            return;
        }
        double peso = Double.parseDouble(pesoStr);
        double altura = Double.parseDouble(alturaStr);
        ModelIMC calculo = new ModelIMC();
        calculo.calcularIMC(peso, altura);

        
        req.setAttribute("imc", calculo.getImc());
        req.setAttribute("message", calculo.getMensagem());
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}