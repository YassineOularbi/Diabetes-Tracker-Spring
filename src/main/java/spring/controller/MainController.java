package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.service.DiabeticService;
import spring.service.DoctorService;

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    private DiabeticService diabeticService;

    @Autowired
    private DoctorService doctorService;

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
}
