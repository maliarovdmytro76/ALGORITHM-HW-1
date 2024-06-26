
// Временная сложность O(n log n)
    import java.util.Scanner;
    public class ComplexityExample {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число n: ");
            int n = scanner.nextInt();
            int a = 0;
            for (int i = n / 2; i <= n; i++) {
                for (int j = 2; j <= n; j *= 2) {
                    a = a + n / 2;
                }
            }

            System.out.println("Результат: " + a);
        }
    }


