class Array{

    int [] array;
    int [] even = new int[21];

    void fibonacci (int [] array){
        int num1 = 0, num2 = 1;

        for (int i = 0; i < array.length; i++) {

            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            array[i] = num1;
        }
        for(int i=0;i<array.length;i++){
            if(array[i] % 2 == 0){
                even[i] = array[i];
            }
        }
        for(int i=0;i<even.length;i++){
            if(even[i] != 0){
                System.out.println(even[i]);
            }
        }
    }

    void sum(){
        int sum = 0;
        for(int i=0;i<array.length;i++){
            sum += i;
        }
        System.out.println(sum);
    }

    void display (){
        for(int i=0;i<this.array.length;i++){
            System.out.println(array[i]);
        }
    }
}

public class Array_que {
    public static void main(String args[]){

        Array arr = new Array();

        int [] arr1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        arr.fibonacci(arr1);
        //arr.sum();
        //arr.display();


        
    }
}
