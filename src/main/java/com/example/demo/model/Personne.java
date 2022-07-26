package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="personne")
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name="idPersonne")
    private Long id;
    @Column (name="nomUtilisateur")
    private String nom;

    @Column (name="prenomUtilisateur")
    private String prenom;
}
