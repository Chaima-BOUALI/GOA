package com.goa.start.exercice.Services;

import com.goa.start.exercice.entities.Categories;

import java.util.List;

public interface CatégorieIService {

    List<Categories> retrieveAllCategories();

    Categories addCategories(Categories C);

    void deleteCategories(int id);

    Categories updateCategories(Categories C);

    Categories retrieveCategories(int id);
}
