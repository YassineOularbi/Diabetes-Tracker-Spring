package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.enums.IngredientType;
import spring.model.Ingredient;
import spring.model.Nutrient;
import spring.service.IngredientService;

@Controller
@RequestMapping("/")
public class TestController {

    @Autowired
    private IngredientService ingredientService;

    @GetMapping("/")
    public String test(){
        Ingredient ingredient = new Ingredient("Tomate", 10.5, "uhudsihd.com", IngredientType.Vegetable);
        Nutrient nutrient = new Nutrient(10.0, 10.0, 20.7, 30.9, 40.0, 50.8, "ljisjed", "ljpoed");
        Ingredient savedIng = ingredientService.save(ingredient);
        return "hello";
    }
}
