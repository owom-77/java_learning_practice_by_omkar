import java.util.Scanner;

public class prime {

    void primNum(){
        Scanner sc = new Scanner(System.in);

        boolean check = true;
        System.out.println("Enter a number");
        int num  = sc.nextInt(); 

        if(num <= 1){
            check = false;
        }else{
            for(int i = 2;i<num;i++){
                if(num % i == 0){
                    check = false;
                }
            }
        }
        if(check){
            System.out.println("%d is prime number".formatted(num));
        }else{
            System.out.println("%d is not prime number".formatted(num));
        }
    }

    public static void main(String args[]){
        prime pr = new prime();
        pr.primNum();
    }
}
