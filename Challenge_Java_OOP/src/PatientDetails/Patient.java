package PatientDetails;

public class Patient {

    private String Name;
    private int Age;
    private Eye LeftEye;
    private Eye RightEye;
    private Heart heart;
    private Stomach stomach;
    private Skin skin;
    public Object getStomach;

    public Patient(String Name,int age) {
        this.setName(Name);
        this.setAge(age);
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public Skin getSkin() {
        return skin;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }

    public Stomach getStomach() {
        return stomach;
    }

    public void setStomach(Stomach stomach) {
        this.stomach = stomach;
    }

    public Heart getHeart() {
        return heart;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public Eye getRightEye() {
        return RightEye;
    }

    public void setRightEye(Eye rightEye) {
        this.RightEye = rightEye;
    }

    public Eye getLeftEye() {
        return LeftEye;
    }

    public void setLeftEye(Eye leftEye) {
        this.LeftEye = leftEye;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

}

