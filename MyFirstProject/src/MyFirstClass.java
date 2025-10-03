/**
 * author Franz Aguillon
 * <p>
 * First exercise
 */

public class MyFirstClass {
    static void main(String[] args) {
//        helloWorld();
//        intAndLongVariables();
//        arithmeticOperations();
//        convertCentToEuro();
    }

    static void convertCentToEuro() {
        int cent = 5120; //cent
        Out.print(cent / 100); // 51
        Out.print(",");
        Out.print(cent % 100); // 20
        Out.print(" EUR");
        Out.print((cent / 100) + ", " + (cent % 100) + " EUR");
    }

    static void arithmeticOperations() {
        // Output should look like this 1H 2Z 3E
        int val = 123;
        Out.print(val / 100);
        Out.println("H");
        Out.print(val / 10 % 10);
        Out.println("Z");
        Out.print(val % 10);
        Out.println("E");
    }

    static void helloWorld() {
        // System.out.println() wird durch Out.println() ersetzt
        Out.println("Hello, World!"); // method of the inout library
    }

    static void intAndLongVariables() {
        int a;
        a = 10;
        // a = 3000000000L; // compiler error, number too big
        long l = 3000000000L; // okay
        Out.println(a);
    }

    void readFromConsole() {
        int a = 10;
        int b = In.readInt(); // function of the inout library
        int c = In.readInt(); // function of the inout library
        int sum = a + b + c;
        Out.print("a + b + c = : ");
        Out.println(sum);
    }
}
