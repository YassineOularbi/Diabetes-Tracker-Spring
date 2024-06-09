package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import spring.model.Diabetic;
import spring.model.Ingredient;
import spring.model.Measure;
import spring.model.measure.A1C;
import spring.model.measure.BloodKetone;
import spring.model.measure.Glycemia;
import spring.model.measure.Weight;
import spring.service.*;
import spring.service.measure.A1CService;
import spring.service.measure.BloodKetoneService;
import spring.service.measure.GlycemiaService;
import spring.service.measure.WeightService;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    private DiabeticService diabeticService;

    @Autowired
    private DoctorService doctorService;

    @Autowired
    private GlycemiaService glycemiaService;

    @Autowired
    private BloodKetoneService bloodKetoneService;

    @Autowired
    private A1CService a1CService;

    @Autowired
    private WeightService weightService;

    @Autowired
    public IngredientService ingredientService;

    @Autowired
    private MedicationService medicationService;

    @Autowired
    private MealService mealService;

    @GetMapping("/")
    public String main(Model model){
        model.addAttribute("diabetics", diabeticService.getAll());
        model.addAttribute("doctors", doctorService.getAll());
        model.addAttribute("countDoctors", doctorService.count());
        model.addAttribute("countDiabetics", diabeticService.count());
        return "main";
    }

    @GetMapping("/track")
    public String profile(Model model){
        model.addAttribute("diabetics", diabeticService.getAll());
        return "profile";
    }

    @GetMapping("/dashboard/{id}")
    public String session(HttpSession session, @PathVariable("id") Long id){
        session.setAttribute("user", diabeticService.getById(id));
        return "redirect:/dashboard";
    }
    @GetMapping("/dashboard")
    public String dashboard(Model model, HttpSession session){
        model.addAttribute("measure", new Measure());
        model.addAttribute("glycemias", glycemiaService.getAll((Diabetic) session.getAttribute("user")));
        model.addAttribute("lastGlycemia", glycemiaService.getLast((Diabetic) session.getAttribute("user")));
        model.addAttribute("lastBloodKetone", bloodKetoneService.getLast((Diabetic) session.getAttribute("user")));
        model.addAttribute("lastA1C", a1CService.getLast((Diabetic) session.getAttribute("user")));
        model.addAttribute("lastWeight", weightService.getLast((Diabetic) session.getAttribute("user")));
        model.addAttribute("glyecemiaDifference", glycemiaService.glycemiaDifference((Diabetic) session.getAttribute("user")));
        model.addAttribute("doctors", doctorService.getAll());
        model.addAttribute("countDoctors", doctorService.count());
        model.addAttribute("nutrients", ingredientService.getAll());
        model.addAttribute("medications", medicationService.getAll());
        model.addAttribute("meals", mealService.getAll());
        return "dashboard";
    }
    @PostMapping("/measure-glycemia")
    public String glycemia(@Valid @ModelAttribute("measure") Glycemia glycemia, HttpSession session){
        glycemia.setDiabetic((Diabetic) session.getAttribute("user"));
        glycemiaService.save(glycemia);
        return "redirect:/dashboard";
    }

    @PostMapping("/measure-bloodketone")
    public String bloodKetone(@Valid @ModelAttribute("measure") BloodKetone bloodKetone, HttpSession session){
        bloodKetone.setDiabetic((Diabetic) session.getAttribute("user"));
        bloodKetoneService.save(bloodKetone);
        return "redirect:/dashboard";
    }

    @PostMapping("/measure-hba1c")
    public String HbA1c(@Valid @ModelAttribute("measure")A1C a1C, HttpSession session){
        a1C.setDiabetic((Diabetic) session.getAttribute("user"));
        a1CService.save(a1C);
        return "redirect:/dashboard";
    }

    @PostMapping("/measure-weight")
    public String weight(@Valid @ModelAttribute("measure") Weight weight, HttpSession session){
        weight.setDiabetic((Diabetic) session.getAttribute("user"));
        weightService.save(weight);
        return "redirect:/dashboard";
    }
}
