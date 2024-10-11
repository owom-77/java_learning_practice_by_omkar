import java.util.Scanner;

public class armstrong {
    Scanner sc = new Scanner(System.in);

    void armst(){
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        String num1 = String.valueOf(num);
        int[] digitsArray = new int[num1.length()]; 

        for(int i=0;i<num1.length();i++){
            digitsArray[i] = num1.charAt(i);
        }

        for(int i=0;i<digitsArray.length;i++){
            System.out.println(digitsArray[i]);
        }
    }

    public static void main(String[] args) {
        armstrong arm = new armstrong();
        arm.armst();
    }
}
