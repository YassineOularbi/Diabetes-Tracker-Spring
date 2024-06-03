package spring.entity;

import javax.persistence.*;

@Entity
@Table(name = "diabetes")
public class Diabetes {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private Double degree;
    public Diabetes() {
    }

    public Diabetes(String type, Double degree) {
        this.type = type;
        this.degree = degree;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getDegree() {
        return degree;
    }

    public void setDegree(Double degree) {
        this.degree = degree;
    }
}
