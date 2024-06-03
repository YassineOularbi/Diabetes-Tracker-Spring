package spring.controller;

import java.util.List;

import spring.entity.Diabetes;
import spring.exception.ResourceNotFoundException;
import spring.service.DiabetesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/")
public class DiabetesController {
    private static final Logger LOG = LoggerFactory.getLogger(DiabetesController.class);


    @Autowired
    private DiabetesService diabetesService;

    @GetMapping("/")
    public String show(Model theModel) {
        LOG.debug("inside show StudentForm handler method");
        Diabetes diabetes = new Diabetes();
        theModel.addAttribute("diabetes", diabetes);
        List<Diabetes> diabetesList = diabetesService.getAll();
        theModel.addAttribute("students", diabetesList);
        return "hello";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("diabetes") Diabetes diabetes) {
        diabetesService.save(diabetes);
        return "redirect:/";
    }

    @GetMapping("/update")
    public String Update(@RequestParam("Id") Long Id,
                                    Model theModel) throws ResourceNotFoundException {
        Diabetes diabetes = diabetesService.getById(Id);
        theModel.addAttribute("diabetes", diabetes);
        return "hello";
    }

    @GetMapping("/remove")
    public String delete(@RequestParam("Id") Long Id){
        diabetesService.delete(Id);
        return "redirect:/";
    }

}