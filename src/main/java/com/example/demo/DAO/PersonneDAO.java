package com.example.demo.DAO;

import com.example.demo.model.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneDAO extends JpaRepository<Personne,Long> {
}
