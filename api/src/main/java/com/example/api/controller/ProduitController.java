package com.example.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.dto.AddProductsDto;
import com.example.api.model.Produit;
import com.example.api.service.ProduitService;

@RestController
public class ProduitController {
    private ProduitService produitService;

    @Autowired
    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }

    @GetMapping("/produits")
    public List<Produit> getProduits() {
        return this.produitService.getProduits();
    }

    @PostMapping("/produits")
    public Produit addProduit(@RequestBody AddProductsDto dto) {
        return this.produitService.addProduit(dto.getNom(), dto.getPrix());
    }
}