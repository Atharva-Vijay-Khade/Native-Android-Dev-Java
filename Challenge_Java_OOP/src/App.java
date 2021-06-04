import java.util.Scanner;
import PatientDetails.Eye;
import PatientDetails.Heart;
import PatientDetails.Patient;
import PatientDetails.Skin;
import PatientDetails.Stomach;

public class App {
    public static void main(String[] args) {

        Patient patient = new Patient("Tom", 25);

        patient.setRightEye(new Eye("RightEye", "Normal", "Blue"));
        patient.setLeftEye(new Eye("LeftEye", "Short sighted", "Blue"));
        patient.setHeart(new Heart(65, "Normal"));
        patient.setSkin(new Skin("Skin", "Burned"));
        patient.setStomach(new Stomach("Stomach", "PUD"));

        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());

        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            
            System.out.println("Choose an Organ:");
            System.out.println("\t1. LeftEye");
            System.out.println("\t2. RightEye");
            System.out.println("\t3. Heart");
            System.out.println("\t4. Stoamch");
            System.out.println("\t5. Skin");
            System.out.println("\t6. Quit");

            choice = scanner.nextInt();

            if(choice==6)
                break;
            else if(choice==1){
                System.out.println("Name: "+patient.getLeftEye().getName());
                System.out.println("Medical Condition: "+patient.getLeftEye().getMedicalCondition());
                System.out.println("Color: "+patient.getLeftEye().getColor());
                System.out.println("\t\t1. Close the Eye");
                int c = scanner.nextInt();
                if(c==1){
                    patient.getLeftEye().isEyeOpen(false);
                }
            }
            else if(choice==2){
                System.out.println("Name: "+patient.getRightEye().getName());
                System.out.println("Medical Condition: "+patient.getRightEye().getMedicalCondition());
                System.out.println("Color: "+patient.getRightEye().getColor());
                System.out.println("\t\t1. Close the Eye");
                int c = scanner.nextInt();
                if(c==1){
                    patient.getRightEye().isEyeOpen(true);
                }
            }
            else if(choice==3){
                System.out.println("Name: "+patient.getHeart().getName());
                System.out.println("Medical Condition: "+patient.getHeart().getMedicalCondition());
                System.out.println("Color: "+patient.getHeart().getHeartRate());
                System.out.println("\t\t1. Change the heart rate");
                int c = scanner.nextInt();
                if(c==1){
                    System.out.println(
                        "Enter new Heart Rate"
                    );
                    int newHeartRate = scanner.nextInt();
                    patient.getHeart().setHeartRate(newHeartRate);
                    System.out.println(
                        "Heart Rate Changed to: " + patient.getHeart().getHeartRate()
                    );
                }
            }
            else if(choice==4){
                System.out.println("Name: "+patient.getStomach().getName());
                System.out.println("Medical Condition: "+patient.getStomach().getMedicalCondition());
                System.out.println("Need to be fed");
                System.out.println(
                    "\t\t1. Digest"
                );
                int c = scanner.nextInt();
                if(c==1){
                    patient.getStomach().fed(true);
                }
            }
            else if(choice==5){
                System.out.println("Name: "+patient.getSkin().getName());
                System.out.println("Medical Condition: "+patient.getSkin().getMedicalCondition());
            }
            else{
                continue;
            }

        }
    }
}
