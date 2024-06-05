package spring.model;

import spring.enums.MealPhase;

import javax.persistence.*;
import java.util.List;

@Entity
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private MealPhase phase;
    private String picture;
    @ManyToMany(mappedBy = "meal")
    private List<Diabetic> diabetics;
    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;

    public Meal() {
    }

    public Meal(String name, MealPhase phase, String picture, List<Diabetic> diabetics, Recipe recipe) {
        this.name = name;
        this.phase = phase;
        this.picture = picture;
        this.diabetics = diabetics;
        this.recipe = recipe;
    }

    public Meal(Long id, String name, MealPhase phase, String picture, List<Diabetic> diabetics, Recipe recipe) {
        this.id = id;
        this.name = name;
        this.phase = phase;
        this.picture = picture;
        this.diabetics = diabetics;
        this.recipe = recipe;
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

    public MealPhase getPhase() {
        return phase;
    }

    public void setPhase(MealPhase phase) {
        this.phase = phase;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public List<Diabetic> getDiabetics() {
        return diabetics;
    }

    public void setDiabetics(List<Diabetic> diabetics) {
        this.diabetics = diabetics;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phase=" + phase +
                ", picture='" + picture + '\'' +
                ", diabetics=" + diabetics +
                ", recipe=" + recipe +
                '}';
    }
}
