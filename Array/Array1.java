public class Array1 {
   public static void main(String[] args) {
    int [] array = new int[10];
    int num = 0;

    for(int i=0; i<array.length; i++){
        num += i * 200;
        array[i] = num;
    }
    for(int i=0;i<array.length;i++){
        System.out.println(array[i]);
    }
   } 
}
