import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Student {
    private int marks;

    public Student(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }
}

public class StudentMarks {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter the number of students: ");
            int numberOfStudents = Integer.parseInt(reader.readLine());

            Student[] students = new Student[numberOfStudents];

            for (int i = 0; i < numberOfStudents; i++) {
                System.out.print("Enter the marks for student " + (i + 1) + ": ");
                int marks = Integer.parseInt(reader.readLine());

                students[i] = new Student(marks);
            }

            int totalMarks = 0;

            for (Student student : students) {
                totalMarks += student.getMarks();
            }

            double averageMarks = (double) totalMarks / numberOfStudents;

            System.out.println("Average marks obtained by all students: " + averageMarks);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
