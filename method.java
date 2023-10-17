public class method {

    static void MyMethod() {
        System.out.println("hi");
    };

    static void sum(int a, int b) {
        int sumation = a + b;
        System.out.println(sumation);
    };

    static int mines(int number) {
        return number - 10;
    }

    static void conditional(String name, String lastName) {

        int a = 5;
        int b = 10;

        if(a > b) {
            String LowerName = name.toLowerCase();
            String LowerLastName = lastName.toLowerCase();
            String mergName = LowerName.concat(LowerLastName);

            System.out.println(mergName);
        } else if(b > a) {
            String UpperName = name.toUpperCase();
            String UpperLastName = lastName.toUpperCase();

            String mergLast = UpperName.concat(UpperLastName);

            System.out.println(mergLast);
        } else {
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        MyMethod();
        MyMethod();
        MyMethod();
        MyMethod();

        sum(10, 20);
        sum(-50, 20);
        sum(10, 40);
        sum(0, 20);

        System.out.println(mines(15));;
        System.out.println(mines(5));;
        System.out.println(mines(6));;

        conditional("mohammad", "seyf");

    }
}
