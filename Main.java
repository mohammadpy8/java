public class Main {
    public static void main(String[] args) {

        System.out.println(Messages.generatedMessages());
        System.out.println(newMessages.generatedNumber());

        System.out.println(lengthNumber.chnages());
        System.out.println(IndexFind.Find());

        System.out.println(FindNumberIndex.Finded());
        System.out.println(MathNumber.mathn());

        System.out.println(conditional.ConditionalRender());
        System.out.println(SwithCase.Switch());

        System.out.println(Loop.Looping());

    };

    class Messages {
        static String generatedMessages() {

            String MessageOne = "Hi";
            String MessageTwo = " any Body";
            return MessageOne + MessageTwo;
        }
    };

    class newMessages {
        static int generatedNumber() {
            int NumberOne = 10;
            int NumberTwo = 20;

            return NumberOne + NumberTwo;
        }
    };

    class lengthNumber {

        static String chnages() {
            String Name = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

            return "lenght Name :" + Name.length();
        }
    };

    class IndexFind {

        static String Find() {
            String Lower = "MohammMM";
            String Upper = "mmmaaa";

            return Lower.toLowerCase() + Upper.toUpperCase();
        }
    };

    class FindNumberIndex {

        static String Finded() {

            String name = "ali ";
            String last = "mohammad";

            return name.concat(last);
        }
    };

    class MathNumber {

        static double mathn() {

            int maxing = Math.max(5, 10);
            double radikal = Math.sqrt(64);

            return (int) (maxing + radikal);

        }
    };

    class ArrayDemo {

        public static void main(String[] args) {

            int[] anArray;

            anArray = new int[10];
            anArray[0] = 100;
            anArray[1] = 200;
            anArray[2] = 300;
            anArray[3] = 400;
            anArray[4] = 500;
            anArray[5] = 600;
            anArray[6] = 700;
            anArray[7] = 800;
            anArray[8] = 900;
            anArray[9] = 1000;

            int sumAnArrayHalf = anArray[0] + anArray[1] + anArray[2] + anArray[3] + anArray[4];
            int sumAnArrayFinall = anArray[5] + anArray[6] + anArray[7] + anArray[8] + anArray[9];

            System.out.println(sumAnArrayFinall + sumAnArrayHalf);
        }
    };

    class conditional {

        static int ConditionalRender() {

            int a = 10;
            double b = 1.5;

            if (a > b) {
                return a;
            } else if (a == b) {
                return ((int) (b));
            } else {
                return (int) (a + b);
            }
        }
    };

    class SwithCase {
        static int Switch() {

            int number = 10;

            switch (number) {
                case 5:
                    return 5;
            }

            return 10;
        }
    };

    class Loop {
        static int Looping() {
            for (int i = 1 ; i<5; i++) {
                System.out.println("Outer: " + i);

                for (int j = 0; j < 10; j++) {
                    System.out.println(" Inner: " + j);
                }
            };
            return 10;
        }
    }
};
