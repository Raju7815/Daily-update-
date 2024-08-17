
package school.management.system;

public class SchoolManagementSystem {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("John Doe", 35, "Math", 50000);
        Student student1 = new Student("Alice Smith", 15, "A", 123);
        teacher1.teach();
        teacher1.displayDetails();

        student1.setGrade("B");
        student1.displayDetails();
    }
}

class Person {
    public String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Teacher extends Person {
    private String subject;
    private double salary;

    public Teacher(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }

    public void teach() {
        System.out.println(getName() + " is teaching " + subject);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }

    private String getName() {
return(this.name);
    }
}

class Student extends Person {
    private String grade;
    private int rollNo;

    public Student(String name, int age, String grade, int rollNo) {
        super(name, age);
        this.grade = grade;
        this.rollNo = rollNo;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Grade: " + grade);
        System.out.println("Roll No: " + rollNo);
    }
}