package OOP.Abstraction;

class Teacher {
    String name;

    void teach() {
        System.out.println("Teaching...");
    }
}

class Student {
    String name;

    void learn() {
        System.out.println("Learning...");
    }
}

class Classroom {
    Teacher teacher;
    Student student;

    Classroom(Teacher teacher, Student student) {
        this.teacher = teacher;
        this.student = student;
    }
}

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "Mr. John";
        Student student = new Student();
        student.name = "Mary";
        Classroom classroom = new Classroom(teacher, student);
        classroom.teacher.teach();
        classroom.student.learn();
    }

}
