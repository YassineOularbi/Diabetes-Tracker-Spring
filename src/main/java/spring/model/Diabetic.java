package spring.model;

import spring.enums.DiabeticType;

import javax.persistence.*;
import java.util.List;

@Entity
public class Diabetic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private DiabeticType type;
    private Integer age;
    private String picture;
    @OneToMany(mappedBy = "diabetic", cascade = CascadeType.REMOVE)
    private List<Measure> measures;
    @ManyToMany(mappedBy = "diabetics")
    private List<Doctor> doctors;
    @ManyToMany(mappedBy = "diabetics")
    private List<Meal> meals;

    public Diabetic() {
    }

    public Diabetic(String name, DiabeticType type, Integer age, String picture, List<Measure> measures, List<Doctor> doctors, List<Meal> meals) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.picture = picture;
        this.measures = measures;
        this.doctors = doctors;
        this.meals = meals;
    }

    public Diabetic(Long id, String name, DiabeticType type, Integer age, String picture, List<Measure> measures, List<Doctor> doctors, List<Meal> meals) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.age = age;
        this.picture = picture;
        this.measures = measures;
        this.doctors = doctors;
        this.meals = meals;
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

    public DiabeticType getType() {
        return type;
    }

    public void setType(DiabeticType type) {
        this.type = type;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public List<Measure> getMeasures() {
        return measures;
    }

    public void setMeasures(List<Measure> measures) {
        this.measures = measures;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }

    @Override
    public String toString() {
        return "Diabetic{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", age=" + age +
                ", picture='" + picture + '\'' +
                ", measures=" + measures +
                ", doctors=" + doctors +
                ", meals=" + meals +
                '}';
    }
}
