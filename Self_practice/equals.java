class integer {

    Integer int_obj1 = Integer.valueOf(2);
    Integer int_obj2 = Integer.valueOf(4);

    void compare() {
        System.out.println("Integers are equal: " + int_obj1.equals(int_obj2));
    }

    void add() {
        System.out.println("Addition of integers: " + (int_obj1 + int_obj2));
    }

    void sub() {
        System.out.println("Subtraction of integers: " + (int_obj1 - int_obj2));
    }

    void mul() {
        System.out.println("Multiplication of integers: " + (int_obj1 * int_obj2));
    }

    void div() {
        System.out.println("Division of integers: " + (int_obj1 / int_obj2));
    }
}

class string {

    String str_obj1 = String.valueOf("omkar");
    String str_obj2 = String.valueOf("rohan");

    void concat() {
        System.out.println("Concatenated string: " + str_obj1.concat(str_obj2));
    }

    void len() {
        System.out.println("The str_obj1 length is: %d".formatted(str_obj1.length()));
        System.out.println("The str_obj2 length is: %d".formatted(str_obj2.length()));
    }

    void pos(int index) {
        System.out.println("Character at position " + index + " in str_obj1: " + str_obj1.charAt(index));
    }

    void upper() {
        System.out.println("The str_obj1 uppercase: %s".formatted(str_obj1.toUpperCase()));
        System.out.println("The str_obj2 uppercase: %s".formatted(str_obj2.toUpperCase()));
    }

    void equ() {
        System.out.println("Strings are equal: " + str_obj1.equals(str_obj1));
    }
}

class float1 {

    Float flo_obj1 = Float.valueOf(4.5f);
    Float flo_obj2 = Float.valueOf(3.5f);

    void add() {
        System.out.println("Addition of floats: " + (flo_obj1 + flo_obj2));
    }

    void sub() {
        System.out.println("Subtraction of floats: " + (flo_obj1 - flo_obj2));
    }

    void multi() {
        System.out.println("Multiplication of floats: " + (flo_obj1 * flo_obj2));
    }

    void divide() {
        System.out.println("Division of floats: " + (flo_obj1 / flo_obj2));
    }

    void compare() {
        System.out.println("Floats are equal: " + flo_obj1.equals(flo_obj2));
    }
}

class doub {
    Double db_obj1 = Double.valueOf(10.25d);
    Double db_obj2 = Double.valueOf(5.72d);

    void add() {
        System.out.println("Addition of doubles: " + (db_obj1 + db_obj2));
    }

    void sub() {
        System.out.println("Subtraction of doubles: " + (db_obj1 - db_obj2));
    }

    void multi() {
        System.out.println("Multiplication of doubles: " + (db_obj1 * db_obj2));
    }

    void divide() {
        System.out.println("Division of doubles: " + (db_obj1 / db_obj2));
    }

    void compare() {
        System.out.println("Doubles are equal: " + db_obj1.equals(db_obj2));
    }
}

class long1 {
    Long lo_obj1 = Long.valueOf(30000L);
    Long lo_obj2 = Long.valueOf(50000L);

    void add() {
        System.out.println("Addition of longs: " + (lo_obj1 + lo_obj2));
    }

    void sub() {
        System.out.println("Subtraction of longs: " + (lo_obj1 - lo_obj2));
    }

    void multi() {
        System.out.println("Multiplication of longs: " + (lo_obj1 * lo_obj2));
    }

    void divide() {
        System.out.println("Division of longs: " + (lo_obj1 / lo_obj2));
    }

    void compare() {
        System.out.println("Longs are equal: " + lo_obj1.equals(lo_obj2));
    }
}

public class equals {

    public static void main(String[] args) {
        // Create objects of all classes
        integer in = new integer();
        string str = new string();
        float1 fl = new float1();
        doub db = new doub();
        long1 lo = new long1();

        // Call methods for integer class
        System.out.println("Integer Operations:");
        in.compare();
        in.add();
        in.sub();
        in.mul();
        in.div();
        System.out.println();

        // Call methods for string class
        System.out.println("String Operations:");
        str.concat();
        str.len();
        str.pos(2);
        str.upper();
        str.equ();
        System.out.println();

        // Call methods for float class
        System.out.println("Float Operations:");
        fl.add();
        fl.sub();
        fl.multi();
        fl.divide();
        fl.compare();
        System.out.println();

        // Call methods for double class
        System.out.println("Double Operations:");
        db.add();
        db.sub();
        db.multi();
        db.divide();
        db.compare();
        System.out.println();

        // Call methods for long class
        System.out.println("Long Operations:");
        lo.add();
        lo.sub();
        lo.multi();
        lo.divide();
        lo.compare();
    }
}
