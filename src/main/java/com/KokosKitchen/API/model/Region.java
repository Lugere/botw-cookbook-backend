package com.KokosKitchen.API.model;

import jakarta.persistence.*;

@Entity
@Table(name = "region")
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final String id;
    @Column(name="label")
    private final String label;

    public Region() {
        this.id = "";
        this.label = "";
    }

    public Region(String id, String label) {
        this.id = id;
        this.label = label;
    }

    public String getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

}
