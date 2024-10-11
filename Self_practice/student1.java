import java.util.ArrayList;
import java.util.List;

class Student {
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;

    Student(String firstName, String lastName, int registration, int grade, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.grade = grade;
        this.year = year;
    }

    void printFullName() {
        System.out.println(this.firstName + " " + this.lastName);
    }

    boolean isApproved() {
        return grade >= 60;
    }

    int changeYearIfApproved() {
        if (isApproved()) {
            year++;
            System.out.println("Congratulations! " + firstName + " year " + year);
        }
        return year;
    }

    int getGrade() {
        return grade;
    }

    String getName() {
        return firstName + " " + lastName;
    }
}

class Course {
    String courseName;
    String professorName;
    int year;
    List<Student> children; 

    Course(String courseName, String professorName, int year) {
        this.courseName = courseName;
        this.professorName = professorName;
        this.year = year;
        this.children = new ArrayList<>();
    }

    void enroll(Student student) {
        if (!children.contains(student)) {
            children.add(student);
            System.out.println(student.getName() + " enrolled in " + courseName);
        } else {
            System.out.println(student.getName() + " is already enrolled in " + courseName);
        }
    }

    void enroll(Student[] studentsArray) {
        for (Student student : studentsArray) {
            enroll(student);
        }
    }

    void unEnroll(Student student) {
        if (children.remove(student)) {
            System.out.println(student.getName() + " unenrolled from " + courseName);
        } else {
            System.out.println(student.getName() + " is not enrolled in " + courseName);
        }
    }

    int countStudents() {
        return children.size();
    }

    int bestGrade() {
        int best = 0;
        for (Student student : children) {
            if (student.getGrade() > best) {
                best = student.getGrade();
            }
        }
        return best;
    }

    public String toString() {
        return "Course: " + courseName + ", Professor: " + professorName + ", Year: " + year + ", Enrolled Students: " + children.size();
    }
}

public class student1 {
    public static void main(String[] args) {
        Student st = new Student("Omkar", "Waghmare", 1, 80, 2024); 

        st.printFullName(); 
        if (st.isApproved()) {
            System.out.println("approved");
        } else {
            System.out.println("not approved");
        }
        System.out.println("Current Year: " + st.changeYearIfApproved());


        Course course = new Course("Java programming", "Ambika mam", 2024);

        course.enroll(st); 
        System.out.println(course);
    }
}
