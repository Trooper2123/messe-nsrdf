package com.rosario_lagosul.messe.entity;

import javax.persistence.*;

@Entity
@Table(name = "celebracao")
public class Celebracao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String date;
    private String time;



    public Celebracao(Long id, String date, String time) {
        this.id = id;
        this.date = date;
        this.time = time;
    }

    public Celebracao() {
    }

    public Celebracao(String date, String time) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
