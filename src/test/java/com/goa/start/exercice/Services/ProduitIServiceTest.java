package com.goa.start.exercice.Services;
import org.mockito.exceptions.misusing.UnnecessaryStubbingException;
import com.goa.start.exercice.Repository.CategorieRepository;
import com.goa.start.exercice.Repository.ProduitRepository;
import com.goa.start.exercice.entities.Produit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.InstanceOfAssertFactories.LIST;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willDoNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


import java.util.Date;

import java.util.ListIterator;
import java.util.Optional;
import java.util.List;



@ExtendWith(MockitoExtension.class)

class ProduitIServiceTest {
    @Mock
    private ProduitRepository produitRepository;
    @InjectMocks
    private ProduitServiceImpl service;

    private Produit prod;

    @BeforeEach
    public void setup(){
        produitRepository= Mockito.mock(ProduitRepository.class);
        service = new ProduitServiceImpl(produitRepository);
        prod = Produit.builder()
                .id(1)
                .Nom("Prod1")
                .Qt(2)
                .Date_Creation(new Date(2022-03-17) )
                .Date_modif(new Date(2022-04-22))
                .build();
    }
    @DisplayName("JUnit test for showAll method")
    @Test
    void retrieveAllProduit() {
        // given - precondition or setup

        Produit prod1 = Produit.builder()
                .id(2)
                .Nom("Prod2")
                .Qt(4)
                .Date_Creation(new Date(2022-03-17) )
                .Date_modif(new Date(2022-04-22))
                .build();

        given(produitRepository.findAll()).willReturn(List.of(prod,prod));

        // when -  action or the behaviour that we are going test
        List<Produit> prodlist = service.retrieveAllProduit();

        // then - verify the output
        assertThat(prodlist).isNotNull();
        assertThat(prodlist.size()).isEqualTo(2);
    }

    @DisplayName("JUnit test for AddProduct method")
    @Test
    void addProduit() {

        given(produitRepository.save(prod)).willReturn(prod);

        System.out.println(produitRepository);
        System.out.println(produitRepository);

        // when -  action or the behaviour that we are going test
        Produit savedProduit = service.addProduit(prod);

        System.out.println(savedProduit);
        // then - verify the output
        assertThat(savedProduit).isNotNull();
    }


    @Test
    void deleteProduit() {
     /*   // given - precondition or setup
        int id = 1;

        willDoNothing().given(produitRepository).deleteById(service);

        // when -  action or the behaviour that we are going test
        service.deleteProduit(id);

        // then - verify the output
        verify(produitRepository, times(1)).deleteById(id);*/
    }

    @Test
    void updateProduit() {
        // given - precondition or setup
        given(produitRepository.save(prod)).willReturn(prod);
        prod.setNom("Prod1");
        // when -  action or the behaviour that we are going test
        Produit updateProduit = service.updateProduit(prod);

        // then - verify the output
        assertThat(updateProduit.getNom()).isEqualTo("Prod1");
    }

    @Test
    void retrieveProduit() {

    }

}