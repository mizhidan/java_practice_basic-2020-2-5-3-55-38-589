package model;

import java.util.Arrays;

public class Teacher {
    Student[] stuList= new Student[2];
    String name;

    public void setTeacherInfo(String inputName,Student stu1,Student stu2) {
        name = inputName;
        setStudentInfos(stu1,stu2);
    }

    public void setStudentInfos(Student stu1,Student stu2) {
        stuList[0] = stu1;
        stuList[1] = stu2;
    }

    public void addStudent(Student inputStu) {
        stuList = addStudentInfo(inputStu);
    }

    public Student[] addStudentInfo(Student inputStu) {
        Student[] newStuList = Arrays.copyOf(stuList,stuList.length + 1);
        newStuList[stuList.length] = inputStu;
        return newStuList;
    }

    public void printStudentInfos() {
        for (Student value : stuList) {
            System.out.println(value.name + "," + value.age + "," + value.gender);
        }
    }
}
