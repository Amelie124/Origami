package com.example.demo;

import com.example.demo.DAO.CategorieDAO;
import com.example.demo.model.Categorie;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    CategorieDAO categorieDAO;

    @Test
    public void testCreateCategorie(){
        Categorie cat = new Categorie("Legumes");
        categorieDAO.save(cat);
    }

    @Test
    public void testFindCategorie(){
        Categorie cat=categorieDAO.findById(1L).get();
        System.out.println(cat);

    }

    @Test
    public void testUpdateCategorie(){
        Categorie cat=categorieDAO.findById(1L).get();
        cat.setNom("Viande");
        categorieDAO.save(cat);
        System.out.println(cat);

    }
    @Test
    public void testDelateCategorie(){
        categorieDAO.deleteById(1L);
    }
    @Test
    public void testFindAllCategorie(){
        List<Categorie> cats = categorieDAO.findAll();
        for (Categorie cat:cats)
            System.out.println(cat);
}
    }


