package com.KokosKitchen.API.controller;

import com.KokosKitchen.API.model.CookingEffect;
import com.KokosKitchen.API.model.Ingredient;
import com.KokosKitchen.API.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class IngredientController {

    @Autowired
    IngredientRepository mySqlRepository;

    @GetMapping("/ingredients")
    public List<Ingredient> getAllIngredients() {

        return mySqlRepository.findAll();
    }

    @GetMapping("/ingredients/{id}")
    public Ingredient getIngredient(@PathVariable("id") String id) {

            return mySqlRepository.findById(id).get();
    }

    @GetMapping("/ingredients/{id}/label")
    public String getIngredientLabel(@PathVariable("id") String id) {

        return mySqlRepository.findById(id).get().getLabel();
    }

    @GetMapping("/ingredients/{id}/description")
    public String getIngredientDescription(@PathVariable("id") String id) {

        return mySqlRepository.findById(id).get().getDescription();
    }

    @PostMapping("/ingredients")
    public Ingredient createIngredient(@RequestBody Map<String, String> body) {
        String label = body.get("label");
        String description = body.get("description");
        int heartsRecovered = Integer.parseInt(body.get("heartsRecovered"));
        CookingEffect cookingEffect = CookingEffect.valueOf(body.get("cookingEffect"));

        Ingredient newIngredient = new Ingredient(label, description, heartsRecovered, cookingEffect);
        mySqlRepository.save(newIngredient);

        return newIngredient;
    }

    @PutMapping("/ingredients/{id}")
    public Ingredient updateIngredient(@PathVariable("id") String id, @RequestBody Map<String, String> body) {
        Ingredient current = mySqlRepository.findById(id).get();
        current.setLabel(body.get("label"));
        current.setDescription(body.get("description"));
        current.setHearsRecovered(Integer.parseInt(body.get("heartsRecovered")));
        current.setCookingEffect(CookingEffect.valueOf(body.get("cookingEffect")));

        mySqlRepository.save(current);

        return current;
    }


    @DeleteMapping("/ingredients/{id}")
    public String deleteIngredient(@PathVariable("id") String id) {
        if (!mySqlRepository.findById(id).equals(Optional.empty())) {
            mySqlRepository.deleteById(id);
            return "ingredient_delete_success";
        } return "ingredient_not_found";
    }

}
