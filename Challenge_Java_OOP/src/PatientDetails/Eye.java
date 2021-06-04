package PatientDetails;

import PatientDetails.CommonFeature.CommonFeature;

public class Eye extends CommonFeature {

    private String color;

    public Eye(String whichEye, String medicalCondition, String color) {
        super(whichEye, medicalCondition);
        this.setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void isEyeOpen(boolean isopen) {
        if (isopen)
            System.out.println("Eye is Open");
        else
            System.out.println("Eye is Closed");
    }

}
