package com.goa.start.exercice.Controller;

import com.goa.start.exercice.Services.CatégorieIService;

import com.goa.start.exercice.entities.Categories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/Categorie")
public class CategorieController {
    @Autowired
    CatégorieIService catégorieIService;
    @ResponseBody
    @GetMapping ("/AfficherCatégories")
    public List<Categories> getCategoriesList() {
        List<Categories> listCategories = catégorieIService.retrieveAllCategories();
        return listCategories;
    }
    @PostMapping ("/add")
    @ResponseBody
    public Categories addCategories(@RequestBody Categories C)
    {
        Categories Cat= catégorieIService.addCategories(C);
        return Cat;
    }
    @DeleteMapping("/deleteCat/{Catégorie-id}")
    @ResponseBody
    public void deleteCategories(@PathVariable("Catégorie-id") int id) {
        catégorieIService.deleteCategories(id);
    }

    @PutMapping("/updateCat")
    @ResponseBody
    public Categories updateCategories(@RequestBody Categories C) {
        return catégorieIService.updateCategories(C);
    }
    @GetMapping("/afficherCat/{Cat-id}")
    @ResponseBody
    public Categories retrieveCategories(@PathVariable("Cat-id") int Id) {
        return catégorieIService.retrieveCategories(Id);
    }
}
