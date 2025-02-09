package Model;

import java.util.Random;

public abstract class Pet {
    private String foodId;
    private String type;
    private String healthDateCheck;
    private int vaccineCount;

    public Pet(String type, String healthDateCheck, int vaccineCount) {
        this.foodId = generatePetID();
        this.type = type;
        this.healthDateCheck = healthDateCheck;
        this.vaccineCount = vaccineCount;
    }

    private String generatePetID() {
        Random rand = new Random();
        return String.valueOf(10000000 + rand.nextInt(90000000));
    }

    public String getId() { return foodId; }
    public String getType() { return type; }
    public String getHealthDate() { return healthDateCheck; }
    public int getVaccinecount() { return vaccineCount; }

    public abstract boolean isValid();

    public String toString() {
        return "Food id: " + foodId + " | Type: " + type + " | Health Check: " + healthDateCheck + 
            " | Vaccine count: " + vaccineCount;
    }
}
