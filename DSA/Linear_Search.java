import java.util.Scanner;

public class Linear_Search {                            //Linear Search Algorithm
    Scanner sc = new Scanner(System.in);
    int index;

    void Linear(){
        System.out.println("Enter a number for array size: ");
        int num = sc.nextInt();
        System.out.println("Enter a value to find in array: ");
        int key = sc.nextInt();
        int [] arr = new int[num];
        //boolean bl = false;

        for(int i=0 ;i<num;i++){
            System.out.println("Enter a %d number in array element: ".formatted(i+1));
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                index = i;
                break;
            }else{
                System.out.println("%d not present in array".formatted(key));
                break;
            }
        }
            System.out.println("The %d is present in %d index".formatted(key,index + 1));
    }

    public static void main(String[] args) {
        Linear_Search ls = new Linear_Search();
        ls.Linear();
    }
}
