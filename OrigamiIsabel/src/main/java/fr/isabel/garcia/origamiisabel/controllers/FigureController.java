package fr.isabel.garcia.origamiisabel.controllers;

import fr.isabel.garcia.origamiisabel.model.Figure;
import fr.isabel.garcia.origamiisabel.service.FigureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FigureController {
    @Autowired
    FigureService figureService;

    @RequestMapping(value ="/",method = RequestMethod.GET )
    public String showList(Model model)
    {
        model.addAttribute("list", figureService.getAllFigure());
        return "listFigure";
    }

    @RequestMapping(value ="/figure/{id}",method = RequestMethod.GET )
    public String showFigure(@PathVariable("id") Long id, Model model)
    {
        model.addAttribute("list", figureService.getFigure(id));
        return "listFigure";
    }


    @RequestMapping(value ="/ajouter",method = RequestMethod.GET )
    public String showCreate()
    {
        return "createFigure";
    }



    @RequestMapping(value ="/saveFigure",method = RequestMethod.POST)
    public String saveFigure(@ModelAttribute Figure figure, Model model)
    {
        figureService.saveFigure(figure);
        model.addAttribute("list",figure);
        return "listFigure";
    }


    @RequestMapping(value ="/modificationFigure/{id}",method = RequestMethod.GET )
    public String showModification(@PathVariable("id") Long id, Model model)
    {
        model.addAttribute("list", figureService.getFigure(id));
        return "modificationFigure";
    }

    @RequestMapping(value ="/deleteFigure",method = RequestMethod.POST)
    public String deleteFigure(@ModelAttribute Figure figure, Model model)
    {
        figureService.deleteFigure(figure);
        model.addAttribute("list", figureService.getAllFigure());
        return "listFigure";
    }

    @RequestMapping(value ="/supprimerFigure",method = RequestMethod.GET )
    public String showSuprimer()
    {
        return "supprimerFigure";
    }

}
