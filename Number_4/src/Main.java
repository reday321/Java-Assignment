import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100); // Generate random numbers between 0 and 99
            System.out.print(numbers[i] + " ");
        }

        int max = numbers[0];
        int min = numbers[0];

        for (int num : numbers) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("\nMax: " + max);
        System.out.println("Min: " + min);
    }
}
