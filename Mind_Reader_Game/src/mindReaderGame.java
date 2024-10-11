import java.util.Random;
import java.util.Scanner;

class mind {
    int comp;
    int attempt;
    Scanner sc = new Scanner(System.in);

    mind(int maxRange){
        Random rd = new Random();
        this.comp = rd.nextInt(maxRange)+1;
        System.out.println(this.comp);
        this.attempt = 0; 
    }

    void playGame(){

        System.out.println("Welcome to mind reader game");
        int user = 0;

        while(user != comp){
            System.out.println("Enter a value: ");
            user = sc.nextInt();
            attempt ++;

            if(user == comp){
                System.out.println("Coungratulation you gess the number in %d attempt".formatted(attempt));
            }else if(user > comp){
                System.out.println("The number is to larg");
            }else{
                System.out.println("Number is to small");
            }   
        }
    }
}

public class mindReaderGame {
    public static void main(String args[]){
        mind m = new mind(10);
        m.playGame();
    }
}
