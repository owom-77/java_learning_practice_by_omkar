import java.util.Scanner;
import java.util.Random;

class mind { 
    int attempt;
    int comp;
    Scanner sc = new Scanner(System.in);

    mind(int range){
        Random rd = new Random();
        comp = rd.nextInt(range)+1;
        this.attempt = 0;
    }
    void playGame(){
        System.out.println("Welcome to mind reader game");
        System.out.println("Enter a value: ");
        int user = sc.nextInt();

        while(user != comp){
            attempt ++;
            if(user == comp){
                System.out.println("Congratulation you win in %d".formatted(attempt));
            }else if(user > comp){
                System.out.println("Number is grater");
            }else{
                System.out.println("Number is smaller");
            }
        }
    }
}

public class pract_mind {
    public static void main(String args[]){
        mind md = new mind(10);
        md.playGame();
    }
}
