public class addArray {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6};
        int [] newArray = new int[array.length];

        for(int i=0;i<array.length;i++){
            newArray[i] = array[i];
        }

        for(int i=0;i<newArray.length;i++){
            System.out.println("newArray[%d] = %d".formatted(i,array[i]));
        }
    }
}
