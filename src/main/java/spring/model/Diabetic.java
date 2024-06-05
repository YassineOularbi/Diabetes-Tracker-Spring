package spring.model;

import spring.enums.DiabeticType;

public class Diabetic {
    private Long id;
    private String name;
    private DiabeticType type;
    private Double weight;
    private Integer age;
    private String picture;

    public Diabetic() {
    }

    public Diabetic(String name, DiabeticType type, Double weight, Integer age, String picture) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.age = age;
        this.picture = picture;
    }

    public Diabetic(Long id, String name, DiabeticType type, Double weight, Integer age, String picture) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.age = age;
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

    public DiabeticType getType() {
        return type;
    }

    public void setType(DiabeticType type) {
        this.type = type;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
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
}
