package com.servlets;

public class Imc {
	
	// Attributs privés
    private double taille;
    private double poids;
    
    // Constructeur
    public Imc(double taille, double poids) {
        this.taille = taille;
        this.poids = poids;
    }
    
    // Méthode pour calculer l'IMC
    public double calcul() {
        return poids / (taille * taille);
    }
    
    // Optionnel: Getters et Setters
    public double getTaille() {
        return taille;
    }
    
    public void setTaille(double taille) {
        this.taille = taille;
    }
    
    public double getPoids() {
        return poids;
    }
    
    public void setPoids(double poids) {
        this.poids = poids;
    }

}
