package com.rosario_lagosul.messe.controller.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class CelebracaoRequest {
    private Long id;
    private String date;
    private String time;

    public CelebracaoRequest(Long id, String date, String time) {
        this.id = id;
        this.date = date;
        this.time = time;
    }

    public CelebracaoRequest(String date, String time) {
        this.date = date;
        this.time = time;
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