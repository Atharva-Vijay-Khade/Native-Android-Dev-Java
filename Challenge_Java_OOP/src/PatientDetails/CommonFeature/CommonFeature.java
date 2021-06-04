package PatientDetails.CommonFeature;

public class CommonFeature {

    private String Name;
    private String MedicalCondition;

    public CommonFeature(String name, String medC) {
        this.setName(name);
        this.setMedicalCondition(medC);
    }

    public String getMedicalCondition() {
        return MedicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.MedicalCondition = medicalCondition;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

}
