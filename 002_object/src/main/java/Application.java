import model.Student;

public class Application {

    public static void main(String[] args) {
        Student stu = new Student();
        stu.age = 20;
        stu.name = "李莉";
        stu.gender = "female";
        stu.rest();
        stu.study();
    }
}
