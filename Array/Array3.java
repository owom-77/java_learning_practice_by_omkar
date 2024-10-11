public class Array3 {
    public static void main(String[] args) {

        //Intialization premitive array

        int [] num = {1,2,3,4,5,6,7,8,9,10};
        String [] str = {"omkar","aditya","rohan","jay"};
        float [] flo = {2.4f,4.5f,22.4f,45.35f};
        boolean [] bl = {true,false,false,true};
        char [] ch = {'A','B','C','D'};
        double [] db = {34.2,12.5,2.5,56.4};
        long [] lg = {2435l,33435l,2424l,45l};
        short [] sh = {10,20,30,40,50};

        //Print array
        
        for (int nu : num) {
            System.out.print(nu + " ");
        }

        System.out.println();

        for (String nu : str) {
            System.out.print(nu + " ");
        }

        System.out.println();

        for (float nu : flo) {
            System.out.print(nu + " ");
        }

        System.out.println();

        for (double nu : db) {
            System.out.print(nu + " ");
        }

        System.out.println();
        
        for (char nu : ch) {
            System.out.print(nu + " ");
        }

        System.out.println();

        for (boolean nu : bl) {
            System.out.print(nu + " ");
        }

        System.out.println();

        for (long nu : lg) {
            System.out.print(nu + " ");
        }

        System.out.println();

        for (short nu : sh) {
            System.out.print(nu + " ");
        }

        System.out.println();
    }
}
