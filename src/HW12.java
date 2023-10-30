import java.util.Arrays;
import java.util.Random;
public class HW12 {
    public static void main(String[] args) {
        int[] lotteryNumbers = generateRandomArray(7);
        int[] playerNumbers = generateRandomArray(7);
        Arrays.sort(lotteryNumbers);
        Arrays.sort(playerNumbers);
        System.out.println(Arrays.toString(lotteryNumbers));
        System.out.println(Arrays.toString(playerNumbers));
        int matches = countMatches(lotteryNumbers, playerNumbers);
        System.out.println("Number of matches: " + matches);
    }

    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }

    public static int countMatches(int[] array1, int[] array2) {
        int matches = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i]) {
                matches++;
            }
        }
        return matches;
    }
}