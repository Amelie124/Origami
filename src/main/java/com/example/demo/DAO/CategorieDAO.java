package com.example.demo.DAO;

import com.example.demo.model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieDAO extends JpaRepository<Categorie,Long> {
}
