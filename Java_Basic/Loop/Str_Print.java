import java.util.Scanner;

public class Str_Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.println("Your name is %s".formatted(name));

        for(int i=0; i<name.length();i++){
            System.out.println("name[%d] = %s".formatted(i,name.charAt(i)));
        }
    }
}
