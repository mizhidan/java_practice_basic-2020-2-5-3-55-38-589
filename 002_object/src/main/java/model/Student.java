package model;

public class Student {
    String name;
    int age;
    String gender;

    public void setInfo(String inputName,int inputAge,String inputGender) {
        age = inputAge;
        name = inputName;
        gender = inputGender;
    }

    public void study() {
        System.out.println("读书\n");
    }

    public void rest() {
        System.out.println("睡觉\n");
    }
}
