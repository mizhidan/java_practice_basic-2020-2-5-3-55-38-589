import model.Student;
import model.Teacher;

public class Application {

    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setInfo("李莉",20,"女");
        stu1.rest();
        stu1.study();
        Student stu2 = new Student();
        stu2.setInfo("王其",21,"男");
        Teacher teacher = new Teacher("张龙",stu1,stu2);
        Student stu3 = new Student();
        stu3.setInfo("赵毅",22,"男");
        teacher.addStudent(stu3);
        teacher.printStudentInfos();
    }
}
