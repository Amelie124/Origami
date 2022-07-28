package com.example.demo.DAO;

import com.example.demo.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitDAO extends JpaRepository<Produit,Long> {
}
