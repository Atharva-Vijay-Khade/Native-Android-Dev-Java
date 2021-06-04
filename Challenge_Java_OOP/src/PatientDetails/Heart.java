package PatientDetails;

import PatientDetails.CommonFeature.CommonFeature;

public class Heart extends CommonFeature {

    private int heartRate;
    public Heart(int heartRate,String Medc) {
        super("Heart",Medc);
        this.setHeartRate(heartRate);
    }

    public int getHeartRate() {
        return heartRate;
    }
    
    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

}
