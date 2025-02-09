package Model;

public class Phoenix extends Pet {
    private boolean fireProofCertificate;

    public Phoenix(String healthDateCheck, int vaccineCount, String fireProofCertificate) {
        super("Phoenix", healthDateCheck, vaccineCount);
        this.fireProofCertificate = fireProofCertificate.equals("y");
    }

    @Override
    public boolean isValid() {
        return fireProofCertificate;
    }

    @Override
    public String toString() {
        return super.toString() + " | Fire-Proof: " + fireProofCertificate;
    }
}
