package Model;

public class Dragon extends Pet {
    private int smokePollutionLevel;

    public Dragon(String healDateCheck, int vaccineCount, int smokePollutionLevel) {
        super("Dragon", healDateCheck, vaccineCount);
        this.smokePollutionLevel = smokePollutionLevel;
    }

    @Override
    public boolean isValid() {
        return smokePollutionLevel <= 70;
    }

    @Override
    public String toString() {
        return super.toString() + " | Smoke Pollution: " + smokePollutionLevel + "%";
    }
}
