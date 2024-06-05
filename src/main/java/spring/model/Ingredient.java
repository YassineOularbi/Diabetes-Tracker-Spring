package spring.model;

import spring.enums.IngredientType;

public class Ingredient {
    private Long id;
    private String name;
    private Double amount;
    private String picture;
    private IngredientType type;

    public Ingredient() {
    }

    public Ingredient(String name, Double amount, String picture, IngredientType type) {
        this.name = name;
        this.amount = amount;
        this.picture = picture;
        this.type = type;
    }

    public Ingredient(Long id, String name, Double amount, String picture, IngredientType type) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.picture = picture;
        this.type = type;
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

    @Override
    public String toString() {
        return "Ingredient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", picture='" + picture + '\'' +
                ", type=" + type +
                '}';
    }
}
