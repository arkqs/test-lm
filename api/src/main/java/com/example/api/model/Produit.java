package com.example.api.model;

public class Produit {
    private int id;
    private String nom;
    private float prix;

    private static int lastId = 1;

    public Produit(String nom, float prix) {
        this.id = lastId++;
        this.nom = nom.length() == 0 ? "Non spécifié" : nom;
        this.prix = prix < 0 ? 0 : prix;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }
}