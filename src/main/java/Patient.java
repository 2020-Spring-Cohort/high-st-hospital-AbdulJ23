public class Patient {
    private String name;
    private int bloodLevel;
    private int healthLevel;


    public Patient(String name, int bloodLevel, int healthLevel) {
        this.name = name;
        this.bloodLevel = bloodLevel;
        this.healthLevel = healthLevel;

    }
    public int getBloodLevel() {
        return bloodLevel;
    }

    public void drawBlood(int amountDrawn) {
        bloodLevel -= amountDrawn;
    }

    public void careForPatient(int increaseInHealthLevel) {
        healthLevel += increaseInHealthLevel;
    }

    public int getHealthLevel() {
        return healthLevel;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Patient " + name +
                "| bloodLevel " + bloodLevel + "| " +
                "healthLevel " + healthLevel + " | ";
    }
}