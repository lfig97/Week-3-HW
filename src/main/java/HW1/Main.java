package HW1;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator(9,5);

        System.out.println(c.add());
        System.out.println("===================================");
        System.out.println(c.subtract());
        System.out.println("===================================");
        System.out.println(c.multiply());
        System.out.println("===================================");
        System.out.println(c.divide());
        System.out.println("===================================");
        System.out.println(c.square());
        System.out.println("===================================");
        System.out.println(c.squareRoot());
        System.out.println("===================================");
        System.out.println(c.exponents());
    }
}
