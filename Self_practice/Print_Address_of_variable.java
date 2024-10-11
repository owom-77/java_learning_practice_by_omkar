public class Print_Address_of_variable {
    public static void main(String[] args) {
        int i = 1;
        float f = 3.5f;
        char ch = 'a';
        double db = 345.768d;

        System.out.println("interger i address is %d".formatted(System.identityHashCode(i)));
        System.out.println("float f address is %d".formatted(System.identityHashCode(f)));
        System.out.println("ch ch address is %d".formatted(System.identityHashCode(ch)));
        System.out.println("double db address is %d".formatted(System.identityHashCode(db)));

    }
}
