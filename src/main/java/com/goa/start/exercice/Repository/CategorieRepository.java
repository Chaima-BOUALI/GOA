package com.goa.start.exercice.Repository;

import com.goa.start.exercice.entities.Categories;
import com.goa.start.exercice.entities.Produit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepository  extends CrudRepository<Categories, Integer> {
}
