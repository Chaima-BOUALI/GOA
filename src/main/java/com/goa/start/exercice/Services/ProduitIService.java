package com.goa.start.exercice.Services;

import com.goa.start.exercice.entities.Categories;
import com.goa.start.exercice.entities.Produit;

import java.util.List;

public interface ProduitIService {
    List<Produit> retrieveAllProduit();

    Produit addProduit(Produit p);

    void deleteProduit(int id);

    Produit updateProduit(Produit p);

    Produit retrieveProduit(int id);
}
