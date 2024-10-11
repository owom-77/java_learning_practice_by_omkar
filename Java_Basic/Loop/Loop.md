1. For Loop

        *Syntax:

            for (initialization; condition; update) {
                // code to be executed
            }


        *Example:

            public class ForLoopExample {
                public static void main(String[] args) {
                    for (int i = 1; i <= 5; i++) {
                        System.out.println("For Loop iteration: " + i);
                    }
                }
            }


2. While Loop

        *Syntax:

            java
            Copy code
            while (condition) {
                // code to be executed
            }

        *Example:


            public class WhileLoopExample {
                public static void main(String[] args) {
                    int i = 1;
                    while (i <= 5) {
                        System.out.println("While Loop iteration: " + i);
                        i++;
                    }
                }
            }




3. Do-While Loop

        *Syntax:

                java
                Copy code
                do {
                    // code to be executed
                } while (condition);


        *Example:

                public class DoWhileLoopExample {
                    public static void main(String[] args) {
                        int i = 1;
                        do {
                            System.out.println("Do-While Loop iteration: " + i);
                            i++;
                        } while (i <= 5);
                    }
                }


4. continue statement

            *Syntax:

                continue;


            *Example with for loop:

                for (int i = 0; i < 5; i++) {
                    if (i == 2) {
                        continue; // Skip the rest of the loop when i equals 2
                    }
                    System.out.println("Iteration: " + i);
                }


5. return statement

        *Syntax:


            return;  // Without a value for void methods
            return value;  // With a value for non-void methods

        Example:


            public static int addNumbers(int a, int b) {
                return a + b;  // Returns the sum of a and b
            }

            public static void main(String[] args) {
                int result = addNumbers(5, 10);
                System.out.println("Result: " + result);  // Outputs: Result: 15
            }