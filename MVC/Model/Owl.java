package Model;

public class Owl extends Pet {
    private int flighDistance;

    public Owl(String healDateCheck, int vaccineCount, int flighDistance) {
        super("Owl", healDateCheck, vaccineCount);
        this.flighDistance = flighDistance;
    }

    @Override
    public boolean isValid() {
        return flighDistance >= 100;
    }

    @Override
    public String toString() {
        return super.toString() + " | Flight Distance: " + flighDistance + " km";
    }
}
