import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      double[] array = {17.3, 25.5, 0.5, -12.2, 5.6, 2.2, 10.5, -23.7, -4.6, 1.2, 7.7, 4.1, -1.12, 3.4, 2.7};
        boolean negativeNum= false;

        double sum = 0;
        int count = 0;

        for (double number : array) {
            if (negativeNum) {
                if (number > 0) {
                    sum += number;
                    count++;
                }
            } else {
                if (number < 0) {
                    negativeNum = true;
                }
            }
        }


//        if (count > 0) {
//            double average = sum / count;
            System.out.println( Arrays.toString(array) + " = " + sum + "/" + count);
//        } else {
//            System.out.println("В массиве нет положительных чисел после первого отрицательного числа.");
//        }
//       доп дз:
               int[] array2 = {-4, 2, 5, -1, 8, 11};
              System.out.println("Исходный массив:");
                printArray(array2);

                selectionSort(array2);

                System.out.println("Отсортированный массив:");
                printArray(array2);
            }

            public static void selectionSort(int[] array) {
                int numOfelements = array.length;

                for (int i = 0; i < numOfelements- 1; i++) {
                    int minIndex = i;


                    for (int j = i + 1; j < numOfelements; j++) {
                        if (array[j] < array[minIndex]) {
                            minIndex = j;
                        }
                    }

                    int temp = array[minIndex];
                    array[minIndex] = array[i];
                    array[i] = temp;


                    System.out.println("Итерация :" );
                    printArray(array);
                }
            }

            public static void printArray(int[] array) {
                for (int num : array) {
                    System.out.print(num + " ");
                }
                 System.out.println();
            }
        }



