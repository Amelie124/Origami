package fr.isabel.garcia.origamiisabel.service;

import fr.isabel.garcia.origamiisabel.DAO.FigureDAO;
import fr.isabel.garcia.origamiisabel.model.Figure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class FigureServiceImp implements FigureService{
    @Autowired
    FigureDAO figureDAO;

    @Override
    public Figure saveFigure(Figure p) {
        return figureDAO.save(p);
    }

    @Override
    public Figure updateFigure(Figure p) {
        return figureDAO.save(p);
    }

    @Override
    public void deleteFigure(Figure p) {
        figureDAO.delete(p);

    }

    @Override
    public Figure getFigure(Long id) {
        return figureDAO.findById(id).get();
    }

    @Override
    public List<Figure> getAllFigure() {
        return figureDAO.findAll();
    }
}
