class Gen<T> {
    T a;

    Gen(T x) {
        a = x;
    }

    T show() {
        return (a);
    }
}

public class Cases {
public static void main(String[] args) {

    // CASE 1 : CONCEPT OF BOXING
    Gen<Integer> g1 = new Gen<Integer>(100);

     // CASE 2 : CONCEPT OF AUTO BOXING
     int n =100;
     Gen<Integer> g1 = new Gen<Integer>(n);

     // CASE 3 : CONCEPT OF AUTO BOXING
     Gen<Integer> g1 = new Gen<Integer>(100);
     Integer x = g1.show();
     System.out.println(x);

     // CASE 4 : CONCEPT OF AUTO BOXING
     Gen<Integer> g1 = new Gen<Integer>(100);
     int x = g1.show();
     System.out.println(x);
     
}
}
