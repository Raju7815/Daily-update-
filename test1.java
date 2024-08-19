    import java.util.*;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of teacher details you want to enter:");
        int x = sc.nextInt();
        String[] name = new String[x];
        int[] age = new int[x];
        String[] subject = new String[x];
        int[] salary = new int[x];
 Teacher t = new Teacher(x);
        Student st = new Student(y);
        System.out.println("Enter the number of student details you want to enter:");
        int y = sc.nextInt();
        String[] names = new String[y];
        int[] classes = new int[y];
        String[] section = new String[y];

        for (int i = 0; i < x; i++) {
            System.out.println("Enter name of teacher " + (i + 1) + ":");
            name[i] = sc.next();
            System.out.println("Enter age of teacher " + (i + 1) + ":");
            age[i] = sc.nextInt();
            System.out.println("Enter subject of teacher " + (i + 1) + ":");
            subject[i] = sc.next();
            System.out.println("Enter salary of teacher " + (i + 1) + ":");
            salary[i] = sc.nextInt();
        }

        for (int i = 0; i < x; i++) {
            t.teacherdetails(name[i], age[i], subject[i], salary[i], i, x);
        }

        for (int i = 0; i < y; i++) {
            System.out.println("Enter name of student " + (i + 1) + ":");
            names[i] = sc.next();
            System.out.println("Enter class of student " + (i + 1) + ":");
            classes[i] = sc.nextInt();
            System.out.println("Enter section of student " + (i + 1) + ":");
            section[i] = sc.next();
        }

        for (int i = 0; i < y; i++) {
            st.studentdetails(names[i], classes[i], section[i], i, y);
        }

        t.display();
        st.display();
    }
}

class Teacher {
    String[] name;
    int[] age;
    String[] subject;
    int[] salary;
    int l;

    Teacher(int p) {
        name = new String[p];
        age = new int[p];
        subject = new String[p];
        salary = new int[p];
    }

    void teacherdetails(String name1, int age1, String subject1, int salary1, int x, int y) {
        this.l = y;
        this.name[x] = name1;
        this.age[x] = age1;
        this.subject[x] = subject1;
        this.salary[x] = salary1;
    }

    void display() {
        System.out.println("Teachers' details are:");
        for (int i = 0; i < l; i++) {
            System.out.println("Name: " + name[i]);
            System.out.println("Age: " + age[i]);
            System.out.println("Subject: " + subject[i]);
            System.out.println("Salary: " + salary[i]);
        }
    }
}

class Student {
    String[] name;
    int[] Class;
    String[] section;
    int l;

    Student(int q) {
        name = new String[q];
        Class = new int[q];
        section = new String[q];
    }

    void studentdetails(String name1, int Class1, String sec, int x, int y) {
        this.name[x] = name1;
        this.Class[x] = Class1;
        this.section[x] = sec;
        this.l = y;
    }

    void display() {
        System.out.println("Students' details are:");
        for (int i = 0; i < l; i++) {
            System.out.println("Name: " + name[i]);
            System.out.println("Class: " + Class[i]);
            System.out.println("Section: " + section[i]);
        }
    }
}
