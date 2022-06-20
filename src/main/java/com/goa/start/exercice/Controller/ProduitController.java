package com.goa.start.exercice.Controller;


import com.goa.start.exercice.Services.ProduitIService;

import com.goa.start.exercice.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Produit")
public class ProduitController {
    @Autowired
    ProduitIService produitIService;
    @ResponseBody
    @GetMapping("/AfficherProduit")
    public List<Produit> getProduitList() {
        List<Produit> listProduits = produitIService.retrieveAllProduit();
        return listProduits;
    }
    @PostMapping("/add")
    @ResponseBody
    public Produit addProduit(@RequestBody Produit p)
    {
        Produit produit= produitIService.addProduit(p);
        return produit;
    }
    @DeleteMapping("/deleteProd/{Prod-id}")
    @ResponseBody
    public void deleteProduit(@PathVariable("Prod-id") int id) {
        produitIService.deleteProduit(id);
    }

    @PutMapping("/updateProd")
    @ResponseBody
    public Produit updateProduit(@RequestBody Produit p ) {
        return produitIService.updateProduit(p);
    }
    @GetMapping("/afficherProd/{Prod-id}")
    @ResponseBody
    public Produit retrieveProduit(@PathVariable("Prod-id") int Id) {
        return produitIService.retrieveProduit(Id);
    }
}
