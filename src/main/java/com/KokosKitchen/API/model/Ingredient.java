package com.KokosKitchen.API.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "ingredient")
public class Ingredient {

  @Id
  private final String id;
  @Column(name = "label")
  private String label;
  @Column(name = "description")
  private String description;
  @Column(name = "hearts_recovered")
  private int hearsRecovered;
  @Enumerated(EnumType.STRING)
  @Column(name = "cooking_effect")
  private CookingEffect cookingEffect;
  //private String[] commonLocations;

  public Ingredient(){
    this.id = "";
    this.label = "";
    this.description = "";
    this.hearsRecovered = 0;
    this.cookingEffect = CookingEffect.NONE;
  }

  public Ingredient(
      String label,
      String description,
      int hearsRecovered,
      CookingEffect cookingEffect
      /*String[] commonLocations*/) {
    this.id = label.toLowerCase().replace(" ", "_");
    this.label = label;
    this.description = description;
    this.hearsRecovered = hearsRecovered;
    this.cookingEffect = cookingEffect;
    //this.commonLocations = commonLocations;
  }

  public String getId() {
    return id;
  }

  public String getLabel() {
    return label;
  }

  public String getDescription() {
    return description;
  }

  public int getHearsRecovered() {
    return hearsRecovered;
  }

  public CookingEffect getCookingEffect() {
    return cookingEffect;
  }
/*
  public String[] getCommonLocations() {
   return commonLocations;
  }
  */

  public void setLabel(String newLabel) {
    label = newLabel;
  }

  public void setDescription(String newDescription) {
    description = newDescription;
  }

  public void setHearsRecovered(int newHeartsRecovered) {
    hearsRecovered = newHeartsRecovered;
  }

  public void setCookingEffect(CookingEffect cookingEffect) {
    this.cookingEffect = cookingEffect;
  }
}
