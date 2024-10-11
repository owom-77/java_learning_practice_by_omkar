package logic;
import java.util.Scanner;

/*Open IntelliJ Idea App and create a project called ClassGrader
Write a program where a user enters the grade of a student and the program returns a grade based on the following conditions

Failed if they scored 3 or less
Insufficient if they scored > 3 but less than 5. (5 included)
Good if they scored > 5 but less than 8. (8 included)
Excellent Grade if they scored 10.
if participants enter a negative number or a number outside the range supported (outside 0 - 10) */

public class marks {

    private static void check(int grade){
        if(grade >= 10 || grade <= 0){
            System.out.println("please enter valid input");
        }
        else if(grade > 5 && grade < 10){
           System.out.println("you pass");
        }else if(grade > 5 && grade <8){
            System.out.println("Insufficient");
        }else if(grade == 10){
            System.out.println("Excellent grade");
        }else{
            System.out.println("You are failed");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a grade: ");
        int grade = sc.nextInt();
        check(grade);
    }
}
