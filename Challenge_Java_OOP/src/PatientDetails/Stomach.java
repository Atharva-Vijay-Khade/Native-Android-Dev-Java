package PatientDetails;

import PatientDetails.CommonFeature.CommonFeature;

public class Stomach extends CommonFeature {
    public Stomach(String name,String medC){
        super(name,medC);
    }

    public void fed(boolean isfed) {
        if(isfed){
            System.out.println("Digesting Begin...");
        }
        else   
            System.out.println("Not consuming food now");
    }

}
