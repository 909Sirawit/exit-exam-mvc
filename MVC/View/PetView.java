package View;

import Model.Pet;

import java.util.List;

public class PetView {
    public void display(List<Pet> pets) {
        System.out.println("======== Pet List ========");
        System.out.println("===== Phoenix =====");
        for (Pet pet : pets) {
            if (pet.getType().equalsIgnoreCase("Phoenix")) {
                System.out.println(pet);
            }
        }
        System.out.println("===== Dragon =====");
        for (Pet pet : pets) {
            if (pet.getType().equalsIgnoreCase("Dragon")) {
                System.out.println(pet);
            }
        }
        System.out.println("===== Owl =====");
        for (Pet pet : pets) {
            if (pet.getType().equalsIgnoreCase("Owl")) {
                System.out.println(pet);
            }
        }
        System.out.println("==========================");
    }

    public void displaySummary(int accepted, int rejected) {
        System.out.println("\n--- Summary ---");
        System.out.println("Accepted: " + accepted);
        System.out.println("Rejected: " + rejected);
    }
}
