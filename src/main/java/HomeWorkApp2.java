public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(sumIsBetween10And20(10,11));
        positiveOrNegativeNumber(1);
        System.out.println(numberIsPositiveOrNegative(1));
        stringPrinter("Hello there!", 2);
    }
    public static boolean sumIsBetween10And20(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
    public static void positiveOrNegativeNumber(int num) {
        if (num < 0) {
            System.out.println("It's a negative number.");
        } else {
            System.out.println("It's a positive number.");
        }
    }
    public static boolean numberIsPositiveOrNegative(int num) {
        return num <= -1;
    }
    public static void stringPrinter(String string, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(string);
        }
    }
}
