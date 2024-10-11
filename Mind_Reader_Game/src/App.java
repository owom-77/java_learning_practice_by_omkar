import java.util.*;
import java.util.Random;

class player {
    int p_score;
    int p_input;

    void printDetail() {
        System.out.println(p_score);
        System.out.println(p_input);
    }
}

class computer {
    int c_score;
    int c_pred;
    Random rd = new Random();

    int prediction() {
        return rd.nextInt(2);
    }

    void printDetail(){
        System.out.println(c_score);
        System.out.println(c_pred);
    }
}

public class App {
    public static void main(String[] args) {

        player p = new player();
        computer c = new computer();

        Scanner sc = new Scanner(System.in);
        for (;;) {
            System.out.println("Enter your Input");
            p.p_input = sc.nextInt();
            System.out.println("You Entered" + p.p_input);

            if (p.p_input == c.c_pred) {
                c.c_score++;
                System.out.println("************************ Current Score ******************");
                p.printDetail();
                c.printDetail()
                
            } else {
                p.p_score++;
            }

            System.out.println("Computer Score" + c.c_score);
            System.out.println("Player Score" + p.p_score);

            if (c.c_score == 4) {
                System.out.println("Computer won");
                break;
            } else if (p.p_score == 4) {
                System.out.println("Player win the game");
                break;

            }
        }

    }
}