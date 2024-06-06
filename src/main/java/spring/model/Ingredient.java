package spring.model;

import spring.enums.IngredientType;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double amount;
    private String picture;
    @Enumerated(EnumType.STRING)
    private IngredientType type;
    @ManyToMany
    private List<Recipe> recipes;
    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "nutrient_id")
    private Nutrient nutrient;

    public Ingredient() {
    }

    public Ingredient(String name, Double amount, String picture, IngredientType type) {
        this.name = name;
        this.amount = amount;
        this.picture = picture;
        this.type = type;
    }

    public Ingredient(String name, Double amount, String picture, IngredientType type, List<Recipe> recipes, Nutrient nutrient) {
        this.name = name;
        this.amount = amount;
        this.picture = picture;
        this.type = type;
        this.recipes = recipes;
        this.nutrient = nutrient;
    }

    public Ingredient(Long id, String name, Double amount, String picture, IngredientType type, List<Recipe> recipes, Nutrient nutrient) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.picture = picture;
        this.type = type;
        this.recipes = recipes;
        this.nutrient = nutrient;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public IngredientType getType() {
        return type;
    }

    public void setType(IngredientType type) {
        this.type = type;
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    public Nutrient getNutrient() {
        return nutrient;
    }

    public void setNutrient(Nutrient nutrient) {
        this.nutrient = nutrient;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", picture='" + picture + '\'' +
                ", type=" + type +
                ", recipes=" + recipes +
                ", nutrient=" + nutrient +
                '}';
    }
}
