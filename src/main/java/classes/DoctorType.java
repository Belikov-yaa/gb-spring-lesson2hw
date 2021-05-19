package classes;

public enum DoctorType {
    SURGEON("SurgeonDoctor"),
    PSYCHOLOGIST("PsychologistDoctor"),
    THERAPIST("TherapistDoctor");

    private String name;

    DoctorType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
