import java.util.Random;

public class WorkWithArrays {
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println("Our array:");
        fillArray(array);
        printArray(array);

        System.out.println("\nMaximal element is: " + findMax(array) + "\n");
        System.out.println("\nMinimal element is: " + findMin(array) + "\n");
    }

    public static void fillArray(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(101);
        }
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}