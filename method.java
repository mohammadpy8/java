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

    }
}
