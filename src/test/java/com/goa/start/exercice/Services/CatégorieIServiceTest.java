package com.goa.start.exercice.Services;

import com.goa.start.exercice.Repository.CategorieRepository;
import com.goa.start.exercice.entities.Categories;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class CatégorieIServiceTest {
    @Mock
    private CategorieRepository repo;
    @InjectMocks
    private CatégoriesServiceImpl service;

    private Categories cat;
    @Test
    void retrieveAllCategories() {
    }

    @Test
    void addCategories() {
    }

    @Test
    void deleteCategories() {
    }

    @Test
    void updateCategories() {
    }

    @Test
    void retrieveCategories() {
    }
}