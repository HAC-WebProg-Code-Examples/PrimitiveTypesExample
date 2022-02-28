package il.ac.hac.cs;

public class Main {

    private int intField;
    private double doubleField;
    private boolean boolField;
    private String strField;

    public Main() {
        System.out.printf("int default value: %d%n", intField);
        System.out.printf("double default value: %f%n", doubleField);
        System.out.printf("boolean default value: %b%n", boolField);
        System.out.printf("String default value: %s%n", strField);

        int localInt;
        double localDouble;
        boolean localBool;
        String localString;

        // Reading uninitialized locals does not compile. To check uncomment next 4 lines:
//        System.out.printf("local int default value: %d%n", localInt);
//        System.out.printf("local double default value: %f%n", localDouble);
//        System.out.printf("local boolean default value: %b%n", localBool);
//        System.out.printf("local String default value: %s%n", localString);
    }

    public static void main(String[] args) {
        new Main();
    }
}
