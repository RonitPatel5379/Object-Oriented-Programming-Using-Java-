class Student {
    String name;
    int roll_No;
    double spi;
    String course;

    public void setStudent() {
        System.out.println("The name of student is " + name);
        System.out.println("The roll_no of student is " + roll_No);
        System.out.println("The spi of student is " + spi);
        System.out.println("The course of student is " + course);
    }

    public void getStudent(String name, int roll_No, double spi, String course) {
        this.name = name;
        this.roll_No = roll_No;
        this.spi = spi;
        this.course = course;
    }
}

public class Studentdemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.getStudent("Ronit", 271, 8.42, "B.TECH CSE");
        s1.setStudent();
    }
}
