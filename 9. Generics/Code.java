class Gen <T> {
    T a;

    Gen (T x)
    {
        a = x;
    }
void show() {
    System.out.println(a + " " + a.getClass());
}
}

class Code
{
    public static void main(String[] args) {
        Gen<String> g1 = new Gen<String>("Hello");
        Gen<Integer> g2 = new Gen<Integer>(100);
        g1.show();  // Call the show method to print the value
        g2.show();
    }
}

// Output 

// Hello class java.lang.String
// 100 class java.lang.Integer
