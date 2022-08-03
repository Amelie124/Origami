package fr.isabel.garcia.origamiisabel.DAO;

import fr.isabel.garcia.origamiisabel.model.Figure;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FigureDAO extends JpaRepository<Figure,Long> {
}
