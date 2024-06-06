package spring.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    @OneToOne
    @JoinColumn(name = "meal_id")
    private Meal meal;
    @ManyToMany(mappedBy = "recipes")
    private List<Ingredient> ingredients;

    public Recipe() {
    }

    public Recipe(String description, Meal meal, List<Ingredient> ingredients) {
        this.description = description;
        this.meal = meal;
        this.ingredients = ingredients;
    }

    public Recipe(Long id, String description, Meal meal, List<Ingredient> ingredients) {
        this.id = id;
        this.description = description;
        this.meal = meal;
        this.ingredients = ingredients;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", meal=" + meal +
                ", ingredients=" + ingredients +
                '}';
    }
}
