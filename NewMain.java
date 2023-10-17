import java.util.ArrayList;

public class NewMain {

    int x;
    int modelYear;
    String modelName;

    public NewMain(int Year, String Name) {

        modelYear = Year;
        modelName = Name;
    };

    public static void main(String[] args) {

        NewMain obj = new NewMain(1950, "bmw");
        NewMain obj1 = new NewMain(1967, "benz");

        System.out.println(obj.modelYear + " " + obj1.modelName);

        obj1.x = 50;
        obj.x = 40;

        System.out.println(obj.x);
        System.out.println(obj1.x);

        MyMethod();
        TThrow();

        System.out.println(Number("nn"));

    };

    static void MyMethod() {
        int a = 10;
        int b = 20;

        if (a > b) {
            ArrayList<Integer> number = new ArrayList<Integer>();

            number.add(15);
            number.add(20);
            number.add(25);
            number.add(10);
            number.add(2);
            number.add(5);

            number.forEach((n) -> {
                int sum = n + 1;
                System.out.println(sum);
            });
        } else {
            ArrayList<Integer> number = new ArrayList<Integer>();

            number.add(15);
            number.add(20);
            number.add(25);
            number.add(10);
            number.add(2);
            number.add(5);

            number.forEach((n) -> {
                int sum = n - 1;
                System.out.println(sum);
            });
        }
    };

    public static void TThrow() {
        System.out.println("hi");
    };

    static String Number(String a) {
        return "mmm".concat(a);
    };

        abstract class Mainly {
        public String fname = "John";
        public int age = 24;
        public abstract void study();
    };

    class Student extends Mainly {
        public int Year = 2018;

        public void study(){
            System.out.println("All study is hi");
        }
    };

    class Secondly {
        public void main(String[] args) {
            Student MyNewStudent = new Student();

            System.out.println(MyNewStudent.fname);
            System.out.println(MyNewStudent.Year);
            System.out.println(MyNewStudent.age);

            MyNewStudent.study();
        }
    }
};