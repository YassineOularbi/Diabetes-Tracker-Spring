package spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Nutrient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double water;
    private Double calorie;
    private Double protein;
    private Double fat;
    private Double glucose;
    private Double carb;
    private String mineral;
    private String vitamin;

    public Nutrient() {
    }

    public Nutrient(Double water, Double calorie, Double protein, Double fat, Double glucose, Double carb, String mineral, String vitamin) {
        this.water = water;
        this.calorie = calorie;
        this.protein = protein;
        this.fat = fat;
        this.glucose = glucose;
        this.carb = carb;
        this.mineral = mineral;
        this.vitamin = vitamin;
    }

    public Nutrient(Long id, Double water, Double calorie, Double protein, Double fat, Double glucose, Double carb, String mineral, String vitamin) {
        this.id = id;
        this.water = water;
        this.calorie = calorie;
        this.protein = protein;
        this.fat = fat;
        this.glucose = glucose;
        this.carb = carb;
        this.mineral = mineral;
        this.vitamin = vitamin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getWater() {
        return water;
    }

    public void setWater(Double water) {
        this.water = water;
    }

    public Double getCalorie() {
        return calorie;
    }

    public void setCalorie(Double calorie) {
        this.calorie = calorie;
    }

    public Double getProtein() {
        return protein;
    }

    public void setProtein(Double protein) {
        this.protein = protein;
    }

    public Double getFat() {
        return fat;
    }

    public void setFat(Double fat) {
        this.fat = fat;
    }

    public Double getGlucose() {
        return glucose;
    }

    public void setGlucose(Double glucose) {
        this.glucose = glucose;
    }

    public Double getCarb() {
        return carb;
    }

    public void setCarb(Double carb) {
        this.carb = carb;
    }

    public String getMineral() {
        return mineral;
    }

    public void setMineral(String mineral) {
        this.mineral = mineral;
    }

    public String getVitamin() {
        return vitamin;
    }

    public void setVitamin(String vitamin) {
        this.vitamin = vitamin;
    }

    @Override
    public String toString() {
        return "Nutrient{" +
                "id=" + id +
                ", water=" + water +
                ", calorie=" + calorie +
                ", protein=" + protein +
                ", fat=" + fat +
                ", glucose=" + glucose +
                ", carb=" + carb +
                ", mineral='" + mineral + '\'' +
                ", vitamin='" + vitamin + '\'' +
                '}';
    }
}
