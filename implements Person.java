//1)Create an interface called "Person" with a method called "speak". Create two classes  called "Student" and "Teacher" that implement  the Person interface and implement the "speak" method. Create objects of both the Student and  Teacher classes and call their respective "speak"  methods.

interface Person {
    void speak();
}

class Student implements Person {
    @Override
    public void speak() {
        System.out.println("Hello, I am a student.");
    }
}

class Teacher implements Person {
    @Override
    public void speak() {
        System.out.println("Hello, I am a teacher.");
    }
}

public class Main {
    public static void main(String[] args) {
        Person student = new Student();
        Person teacher = new Teacher();
        
        student.speak();
        teacher.speak();
    }
}
