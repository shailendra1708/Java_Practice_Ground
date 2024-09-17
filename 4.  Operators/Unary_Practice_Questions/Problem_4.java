public class Problem_4 {
    public static void main(String[] args) {
        int a = 10, b=20, c;
       c=a++ + b++ + ++a + ++b + b++;
        System.out.println(a + " " + b + " " + c);
    }
}

