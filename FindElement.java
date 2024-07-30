package HW2;

public class FindElement {
        public static void main(String[] args) {
            int[] array1 = {100, 112, 256, 349, 770};
            int[] array2 = {72, 86, 113, 119, 265, 445, 892};
            int k = 7;

            int kthElement = findElement(array1, array2, k);
            System.out.println("7th element is " + kthElement);
        }

        public static int findElement(int[] arr1, int[] arr2, int k) {
            int i = 0, j = 0, count = 0;

            while (i < arr1.length && j < arr2.length) {
                if (arr1[i] <= arr2[j]) {
                    count++;
                    if (count == k) return arr1[i];
                    i++;
                } else {
                    count++;
                    if (count == k) return arr2[j];
                    j++;
                }
            }

            while (i < arr1.length) {
                count++;
                if (count == k) return arr1[i];
                i++;
            }

            while (j < arr2.length) {
                count++;
                if (count == k) return arr2[j];
                j++;
            }

            return -1; // в случае, если k выходит за пределы объединенного массива
        }
    }


