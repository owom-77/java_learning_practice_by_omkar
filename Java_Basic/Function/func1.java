import java.util.Scanner;

public class func1 {
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter your name:  ");
        String name = console.next();
        printNameCharacters(name);
        printNameLength(name);
        fullName(name);
    }

    private static void printNameLength(String name) {
        System.out.println(name.length());
    }

    private static void printNameCharacters(String name) {
        for (int i = 0; i < name.length(); i++) {
            System.out.println("name[%d] = %s".formatted(i,name.charAt(i)));
        }
    }
    private static void fullName(String name){
        System.out.println("Enter your Surname: ");
        System.out.println("%s %s".formatted(name,"waghamre"));
    }
}