public class Problem_3 {
    public static void main(String[] args) {
        int a = 10, b, c, d;
        b = a++;
        c = ++b;
        d=c++;
        a = ++d;
        System.out.println(a + " " + b + " " + c + " " + d);
    }
}
