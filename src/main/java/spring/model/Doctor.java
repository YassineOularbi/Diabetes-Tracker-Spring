package spring.model;

import spring.enums.DoctorType;

import javax.persistence.*;

@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private DoctorType jobType;
    private String number;
    private String mail;
    private String picture;

    public Doctor() {
    }

    public Doctor(String name, DoctorType jobType, String number, String mail, String picture) {
        this.name = name;
        this.jobType = jobType;
        this.number = number;
        this.mail = mail;
        this.picture = picture;
    }

    public Doctor(Long id, String name, DoctorType jobType, String number, String mail, String picture) {
        this.id = id;
        this.name = name;
        this.jobType = jobType;
        this.number = number;
        this.mail = mail;
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

    public DoctorType getJobType() {
        return jobType;
    }

    public void setJobType(DoctorType jobType) {
        this.jobType = jobType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", jobType=" + jobType +
                ", number='" + number + '\'' +
                ", mail='" + mail + '\'' +
                ", picture='" + picture + '\'' +
                '}';
    }
}
