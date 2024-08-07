package com.example.api.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.api.model.Produit;

@Service
public class ProduitService {
    private List<Produit> produitList;

    public ProduitService() {
        produitList = new ArrayList<>();

        Produit produit1 = new Produit("Pomme", 0.5f);
        Produit produit2 = new Produit("Cahier", 2.2f);
        Produit produit3 = new Produit("Bouteille d'eau", 1f);

        produitList.addAll(Arrays.asList(produit1, produit2, produit3));
    }

    public List<Produit> getProduits() {
        return produitList;
    }

    public Produit addProduit(String nom, float prix) {
        Produit produit = new Produit(nom, prix);
        this.produitList.add(produit);
        return produit;
    }
}