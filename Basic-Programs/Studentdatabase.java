package DAY11;
import java.util.Arrays;
import java.util.Scanner;
class Student implements Comparable<Student> {
		    private int rollNumber;
		    private String name;
		    public Student(int rollNumber, String name) {
		        this.rollNumber = rollNumber;
		        this.name = name;
		    }
		    public int getRollNumber() {
		        return rollNumber;
		    }
		    public String getName() {
		        return name;
		    }
		    public int compareTo(Student other) {
		        return Integer.compare(this.rollNumber, other.rollNumber);
		    }
		}

public class Studentdatabase{ 
public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int numStudents;

		        System.out.print("Enter the number of students: ");
		        numStudents = Integer.parseInt(sc.nextLine());

		        Student[] students = new Student[numStudents];

		        for (int i = 0; i < numStudents; i++) {
		            System.out.print("Enter student name: ");
		            String name = sc.nextLine();

		            System.out.print("Enter student roll number: ");
		            int rollNumber = Integer.parseInt(sc.nextLine());

		            students[i] = new Student(rollNumber, name);
		        }

		        Arrays.sort(students);

		        System.out.println("\nStudent Database :");
		        for (Student student : students) {
		            System.out.println("Roll Number: " + student.getRollNumber() + ", Name: " + student.getName());
		        }
		    }
	}


