import Model.*;
import View.*;
import Controller.*;

import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PetView view = new PetView();
        PetController controller = new PetController(view);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose Pet Type (1. Phoenix, 2. Dragon, 3. Owl, 0. Exit): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) break;

            System.out.print("Enter Health Check Date (DD/MM/YYYY): ");
            String date = scanner.nextLine();
            System.out.print("Enter Vaccine Count: ");
            int vaccines = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Fire-Proof Certificate (y/n): ");
                String fireProof = scanner.next().trim().toLowerCase();
                controller.addPet(new Phoenix(date, vaccines, fireProof));

            } else if (choice == 2) {
                System.out.print("Smoke Pollution Level (%): ");
                int smoke = scanner.nextInt();
                controller.addPet(new Dragon(date, vaccines, smoke));

            } else if (choice == 3) {
                System.out.print("Flight Distance (km): ");
                int distance = scanner.nextInt();
                controller.addPet(new Owl(date, vaccines, distance));
            }
        }

        controller.showAllPets();

        List<Pet> petList = controller.getPetList();
        PetDatabase petDatabase = new PetDatabase();
        for (Pet pet : petList) {
            petDatabase.addPet(pet);
        }

        scanner.close();
    }
}
