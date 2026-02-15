package com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import com.servlets.Imc;


 
@WebServlet("/CalculDeMonImc")
public class CalculDeMonImc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public CalculDeMonImc() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
		
		
       /* String poidsStr = request.getParameter("poids");
        String tailleStr = request.getParameter("taille");
        
       
        double poids = Double.parseDouble(poidsStr);
        double taille = Double.parseDouble(tailleStr);
        
       
        double imc = poids / (taille * taille);
        
      
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"utf-8\" />");
        out.println("<title>Calcul IMC</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Résultat du calcul IMC (GET)</h1>");
        out.println("<p>Poids: " + poids + " kg</p>");
        out.println("<p>Taille: " + taille + " m</p>");
        out.println("<h2>Votre IMC est: " + String.format("%.2f", imc) + "</h2>");
        out.println("<hr>");
        out.println("<a href='renseignement.html'>← Nouveau calcul</a>");
        out.println("</body>");
        out.println("</html>");*/
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//doGet(request, response);
		String poidsStr = request.getParameter("poids");
        String tailleStr = request.getParameter("taille");
        
       
        double poids = Double.parseDouble(poidsStr);
        double taille = Double.parseDouble(tailleStr);
        
        Imc monImc = new Imc(taille, poids);
        double resultatImc = monImc.calcul();
        //double imc = poids / (taille * taille);
        
      
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        /*out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"utf-8\" />");
        out.println("<title>Calcul IMC</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Résultat du calcul IMC(POST)</h1>");
        out.println("<p>Poids: " + poids + " kg</p>");
        out.println("<p>Taille: " + taille + " m</p>");
        out.println("<h2>Votre IMC est: " + String.format("%.2f", imc) + "</h2>");
        out.println("<hr>");
        out.println("<a href='renseignement.html'>← Nouveau calcul</a>");
        out.println("</body>");
        out.println("</html>");*/
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset='utf-8' />");
        out.println("<title>Calcul IMC</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Résultat du calcul IMC</h1>");
        out.println("<p><strong>Poids:</strong> " + monImc.getPoids() + " kg</p>");
        out.println("<p><strong>Taille:</strong> " + monImc.getTaille() + " m</p>");
        out.println("<h2>Votre IMC: " + String.format("%.2f", resultatImc) + "</h2>");
        out.println("<hr>");
        out.println("<a href='renseignement.html'>← Nouveau calcul</a>");
        out.println("</body>");
        out.println("</html>");
        
        out.close();
		
	}

}
