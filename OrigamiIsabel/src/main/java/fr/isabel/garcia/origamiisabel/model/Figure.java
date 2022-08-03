package fr.isabel.garcia.origamiisabel.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="figure")
public class Figure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column (name="idFigure")
    private Long id;
    @Column (name="nomFigure")
    private String nom;
}
