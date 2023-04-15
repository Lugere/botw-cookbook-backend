package com.KokosKitchen.API.model;

import jakarta.persistence.*;

@Entity
@Table(name = "location")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final String id;
    @Column(name = "label")
    private final String label;

    public Location() {
        this.id = "";
        this.label = "";
    }

    public Location(String id, String label) {
        this.id = id;
        this.label = label;
    }

    public String getId() { return id; }

    public String getLabel() { return label; }
}
