package com.goa.start.exercice.Services;

import com.goa.start.exercice.Repository.ProduitRepository;
import com.goa.start.exercice.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitServiceImpl implements ProduitIService {

    @Autowired
    ProduitRepository produitRepository;

    public ProduitServiceImpl(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }


    @Override
    public List<Produit> retrieveAllProduit() {
        return  (List<Produit>) produitRepository.findAll();
    }

    @Override
    public Produit addProduit(Produit p) {
        return produitRepository.save(p);
    }

    @Override
    public void deleteProduit(int id) {
        produitRepository.deleteById(id);
    }

    @Override
    public Produit updateProduit(Produit p) {
        return produitRepository.save(p);
    }

    @Override
    public Produit retrieveProduit(int id) {
        Produit p = produitRepository.findById(id).get();
        return p;
    }
}
