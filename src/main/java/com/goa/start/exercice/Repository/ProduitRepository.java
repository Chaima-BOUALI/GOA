package com.goa.start.exercice.Repository;

import com.goa.start.exercice.Services.ProduitServiceImpl;
import com.goa.start.exercice.entities.Produit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProduitRepository  extends CrudRepository<Produit, Integer> {
    Optional<Produit> findById(int id);

    void deleteById(ProduitServiceImpl service);
}
