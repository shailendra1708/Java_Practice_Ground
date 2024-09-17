public class Swapping {
    public static void main(String[] args) {
        int a = 10, b = 20, c;
        System.out.println("Before swap a = " + a + " and b = " + b + "");

        // Logic 1
        c = a;
        a = b;
        b = c;

        // Logic 2
        a = a + b;
        b = a - b;
        a = a - b;

        // Logic 3
        a = a ^ b;
        b = a ^ b;
        c = a ^ b;

        System.out.println("Before swap a = " + a + " and b = " + b + "");
    }
}
