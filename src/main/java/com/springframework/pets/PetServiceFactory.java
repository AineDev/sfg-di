package com.springframework.pets;

import com.springframework.pets.services.CatPetService;
import com.springframework.pets.services.DogPetService;
import com.springframework.pets.services.PetService;

public class PetServiceFactory {

    public PetService getPetService(String petType){
        switch (petType) {
            case "dog":
                return new DogPetService();
            case "cat":
                return new CatPetService();
            default:
                return new CatPetService();
        }
    }
}
