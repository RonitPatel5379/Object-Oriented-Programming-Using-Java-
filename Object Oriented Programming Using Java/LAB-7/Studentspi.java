import java.util.Scanner;

class Student {
    int id_no;
    int no_of_subjects_registered;
    String[] subject_code;
    int[] subject_credits;
    String[] grade_obtained;
    double spi;

    Student(int id_no, int no_of_subjects_registered, String[] subject_code, int[] subject_credits,
            String[] grade_obtained) {
        this.id_no = id_no;
        this.no_of_subjects_registered = no_of_subjects_registered;
        this.subject_code = subject_code;
        this.subject_credits = subject_credits;
        this.grade_obtained = grade_obtained;
    }

    public int grade(String grade_obtained) {
        if (grade_obtained.equals("A++")) {
            return 10;
        } else if (grade_obtained.equals("A+")) {
            return 9;
        } else if (grade_obtained.equals("A")) {
            return 8;
        } else if (grade_obtained.equals("B+")) {
            return 7;
        } else if (grade_obtained.equals("B")) {
            return 6;
        } else if (grade_obtained.equals("C")) {
            return 5;
        } else if (grade_obtained.equals("D")) {
            return 4;
        }
        return 0;
    }

    public void calSpi() {
        double totalpoint = 0, totalcredit = 0, spi = 0;
        for(int i=0;i<no_of_subjects_registered;i++) {
            totalcredit += subject_credits[i];
            totalpoint += subject_credits[i]*grade(grade_obtained[i]);
        }
            spi = totalpoint / totalcredit;
            System.out.println("spi=" + spi);
    }
}

public class Studentspi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id_no=");
        int id_no = sc.nextInt();
        System.out.println("Enter no_of_subjects_registered=");
        int no_of_subjects_registered = sc.nextInt();
        System.out.println("Enter subject_code=");
        String[] subject_code = new String[no_of_subjects_registered];
        for (int i = 0; i < subject_code.length; i++) {
            subject_code[i] = sc.next();
        }
        System.out.println("Enter subject_credits=");
        int[] subject_credits = new int[no_of_subjects_registered];
        for (int i = 0; i < subject_credits.length; i++) {
            subject_credits[i] = sc.nextInt();
        }
        System.out.println("Enter grade_obtained=");
        String[] grade_obtained = new String[no_of_subjects_registered];
        for (int i = 0; i < grade_obtained.length; i++) {
            grade_obtained[i] = sc.next();
        }

        Student s1 = new Student(id_no,no_of_subjects_registered,subject_code,subject_credits,grade_obtained);
        s1.calSpi();
        sc.close();
    }
}
