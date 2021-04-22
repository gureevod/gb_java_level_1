import java.util.Arrays;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        //Задание 1
        int[] binaryArr = {0, 1, 1, 1, 0, 1, 0, 0, 1};
        swapZeroesAndOnesInArray(binaryArr);
        System.out.println(Arrays.toString(binaryArr));
        // -->

        //Задание 2
        int[] bigArr = new int[100];
        fillArrayWithNumbers(bigArr);
        System.out.println(Arrays.toString(bigArr));
        // -->

        //Задание 3
        int[] randomNumbers = {1,5,3,2,11,4,5,2,4,8,9,1};
        multiplyBy2IfLessThan6(randomNumbers);
        System.out.println(Arrays.toString(randomNumbers));
        // -->

        //Задание 4
        int rows = 4, column = 4;
        int[][] twoDArray = new int[rows][column];
        for (int row = 0; row < twoDArray.length; row++) {
            for (int col = 0; col < twoDArray[row].length; col++) {
                if (row == col) {
                    twoDArray[row][col] = 1;
                }
            }
        }
        System.out.println(Arrays.deepToString(twoDArray));
        // -->

        //Задание 5
        System.out.println(Arrays.toString(createArrayWithArguments(6,3)));
        // -->
    }

    public static void swapZeroesAndOnesInArray(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

    }
    public static void fillArrayWithNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }
    public static void multiplyBy2IfLessThan6(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 6) {
                arr[i] *= 2;
            }
        }
    }
    public static int[] createArrayWithArguments(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
