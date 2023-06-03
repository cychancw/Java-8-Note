class Product {
    double price;
}

public class Test {

    public void updateUpdates(Product p, double price) {
        price = price * 2;
        p.price = p.price + price;
    }

    public void updateDouble(Double d) {
        d = d * 2;
    }

    public static void main(String[] args) {
        int x = 11;
        int y = 45234523;

        System.out.println("Q1: ");
        System.out.println(x += y -= x += y);
        /*
         * 1.
         * First, the expression x += y is evaluated. This means that the value of y
         * (which is -5) is added to the value of x (which is 8), and the result (which
         * is 3) is stored in x. So after this step, x now has the value 3, and y still
         * has the value -5.
         * 
         * Next, the expression y -= x is evaluated. This means that the value of x
         * (which is 3) is subtracted from the value of y (which is -5), and the result
         * (which is -8) is stored in y. So after this step, x still has the value 3,
         * and y now has the value -8.
         * 
         * Finally, the expression x += y is evaluated. This means that the value of y
         * (which is -8) is added to the value of x (which is 3), and the result (which
         * is -5) is stored in x. So after this step, x now has the value -5, and y
         * still has the value -8.
         * 
         * Therefore, at the end of the expression x += y -= x += y, the value of x is
         * -5 and the value of y is -8. However, since the value of the expression is
         * the final value of x, which is -5, the output of the code will be 0 (as 0 is
         * the default value of an int in Java when not initialized).
         * 
         * i.e. It do not evaluate the expression as System.out.println(x); at the end.
         * Not matter what value is, the output will be 0
         */

        System.out.println("Q2: ");

        Product prt = new Product();
        prt.price = 200;
        double newPrice = 100;

        Test t = new Test();
        t.updateUpdates(prt, newPrice);

        System.out.println(prt.price + " " + newPrice);

        Double d = 10.0;
        t.updateDouble(d);
        System.out.println(d); // Output: 10.0 (unchanged)

    }
}