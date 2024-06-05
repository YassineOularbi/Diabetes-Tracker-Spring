package spring.model;

import spring.enums.MealPhase;

import javax.persistence.*;

@Entity
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private MealPhase phase;
    private String picture;

    public Meal() {
    }

    public Meal(String name, MealPhase phase, String picture) {
        this.name = name;
        this.phase = phase;
        this.picture = picture;
    }

    public Meal(Long id, String name, MealPhase phase, String picture) {
        this.id = id;
        this.name = name;
        this.phase = phase;
        this.picture = picture;
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

    @Override
    public String toString() {
        return "Meal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phase=" + phase +
                ", picture='" + picture + '\'' +
                '}';
    }
}
