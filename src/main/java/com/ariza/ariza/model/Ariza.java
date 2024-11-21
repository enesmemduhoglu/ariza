package com.ariza.ariza.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ariza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String arizaTipi;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArizaTipi() {
        return arizaTipi;
    }

    public void setArizaTipi(String arizaTipi) {
        this.arizaTipi = arizaTipi;
    }

}
