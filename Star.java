
// Временная сложность О(n)
public class Star {
    public static void main(String[] args) {
            int n = 5;
            if (n == 1) {
                return;
            }

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("*");
                    break;
                }
                System.out.println();
            }
        }
    }


