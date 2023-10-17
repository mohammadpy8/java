import java.util.ArrayList;

public class method {

    static void MyMethod() {
        System.out.println("hi");
    };

    static void sum(int a, int b) {
        int sumation = a + b;
        System.out.println(sumation);

    };

    static void did() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        numbers.forEach( (n) -> { System.out.println(n); } );
    }

    static int mines(int number) {
        return number - 10;
    }

    static void conditional(String name, String lastName) {

        int a = 5;
        int b = 10;

        if (a > b) {
            String LowerName = name.toLowerCase();
            String LowerLastName = lastName.toLowerCase();
            String mergName = LowerName.concat(LowerLastName);

            System.out.println(mergName);
        } else if (b > a) {
            String UpperName = name.toUpperCase();
            String UpperLastName = lastName.toUpperCase();

            String mergLast = UpperName.concat(UpperLastName);

            System.out.println(mergLast);
        } else {
            System.out.println("");
        }
    };

    public static int sumation(int number) {

        if (number > 0) {
            return number + sumation(number - 1);
        } else {
            return 0;
        }
    };

    public static void main(String[] args) {
        MyMethod();
        MyMethod();
        MyMethod();
        MyMethod();

        sum(10, 20);
        sum(-50, 20);
        sum(10, 40);
        sum(0, 20);

        System.out.println(mines(15));
        ;
        System.out.println(mines(5));
        ;
        System.out.println(mines(6));
        ;

        conditional("mohammad", "seyf");

        System.out.println(sumation(10));
        did();

    }
}
