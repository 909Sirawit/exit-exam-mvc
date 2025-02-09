package Model;

import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;

public class PetDatabase {
    private List<Pet> petList;
    private String filePath = "Database_CSV/pets_database.csv";

    public PetDatabase() {
        this.petList = new ArrayList<>();
    }

    public void addPet(Pet pet) {
        petList.add(pet);
    }

    public void exportToCSV() {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("food_id, creature_type, health_check, vaccine_count\n");
            for (Pet pet : petList) {
                // if (pet instanceof Phoenix) {
                //     Phoenix phoenix = (Phoenix) pet;
                // } else if (pet instanceof Dragon) {
                //     Dragon dragon = (Dragon) pet;
                // } else if (pet instanceof Owl) {
                //     Owl owl = (Owl) pet;
                // }

                String line = String.format("%s,%s,%s,%d\n",
                    pet.getId(),
                    pet.getType(),
                    pet.getHealthDate(),
                    pet.getVaccinecount()
                );
                writer.write(line);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}