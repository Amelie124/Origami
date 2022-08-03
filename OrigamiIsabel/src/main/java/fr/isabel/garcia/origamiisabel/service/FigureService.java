package fr.isabel.garcia.origamiisabel.service;

import fr.isabel.garcia.origamiisabel.model.Figure;

import java.util.List;

public interface FigureService {
    Figure saveFigure(Figure p);
    Figure updateFigure(Figure p);
    public void deleteFigure(Figure p);
    Figure getFigure(Long id);
    List<Figure> getAllFigure();

}
