package com.goa.start.exercice.Services;

import com.goa.start.exercice.Repository.CategorieRepository;
import com.goa.start.exercice.Repository.ProduitRepository;
import com.goa.start.exercice.entities.Categories;
import com.goa.start.exercice.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatégoriesServiceImpl implements CatégorieIService {
    @Autowired
    CategorieRepository categorieRepository;
    @Override
    public List<Categories> retrieveAllCategories() {
        return (List<Categories>) categorieRepository.findAll();
    }

    @Override
    public Categories addCategories(Categories C) {
        return categorieRepository.save(C);
    }

    @Override
    public void deleteCategories(int id) {
        categorieRepository.deleteById(id);
    }

    @Override
    public Categories updateCategories(Categories C) {
        return categorieRepository.save(C);
    }

    @Override
    public Categories retrieveCategories(int id) {
        Categories C = categorieRepository.findById(id).get();
        return C;
    }

}
