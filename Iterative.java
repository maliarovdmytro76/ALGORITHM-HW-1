public class Iterative {
        public static int factorialIterative(int n) {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }

        public static void main(String[] args) {
            int number = 4;
            int result = factorialIterative(number);
            System.out.println("Итеративный факториал " + number + " равен " + result);
        }
    }


