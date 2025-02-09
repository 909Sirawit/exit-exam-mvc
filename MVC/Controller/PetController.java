package Controller;

import Model.Pet;
import View.PetView;

import java.util.ArrayList;
import java.util.List;

public class PetController {
    private List<Pet> petInventory;
    private PetView view;
    private int acceptedCount = 0;
    private int rejectedCount = 0;

    public PetController(PetView view) {
        this.petInventory = new ArrayList<>();
        this.view = view;
    }

    public void addPet(Pet pet) {
        if (pet.isValid()) {
            petInventory.add(pet);
            acceptedCount++;
        } else {
            rejectedCount++;
        }
    }

    public void showAllPets() {
        view.display(petInventory);
        view.displaySummary(acceptedCount, rejectedCount);
    }

    public List<Pet> getPetList() {
        return this.petInventory;
    }
}

