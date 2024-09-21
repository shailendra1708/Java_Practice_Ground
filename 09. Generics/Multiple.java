class Gen < P, W> { // placeholder for two types
    P a;
    W b;

    // Constructor with two arguments
    Gen(P Temp1, W Temp2) {
        a = Temp1;
        b = Temp2;
    }

    // Method to display values and their types
    void show() {
        System.out.println(a + " class " + a.getClass().getName());  // Print value and type of a
        System.out.println(b + " class " + b.getClass().getName());  // Print value and type of b
    }
}

class Multiple {
    public static void main(String[] args) {
        // Create two generic objects with different types
        Gen<String, Integer> g1 = new Gen<>("Hello", 100);  // String and Integer
        Gen<Integer, Double> g2 = new Gen<>(100, 456.7);    // Integer and Double

        g1.show();  // Call show method for the first object
        g2.show();  // Call show method for the second object
    }
}
