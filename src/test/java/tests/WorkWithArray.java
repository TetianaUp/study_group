package tests;

import java.util.Random;

public class Work_with_array {
    public static void main(String[] args) {
        int [] array = new int [10];
        System.out.println("Our array:");
        fillArray(array);

        System.out.println("\nMaximal element is: "+findMax(array)+"\n");
        System.out.println("\nMinimal element is: "+findMin(array)+"\n");

    }
    public static void fillArray(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] = rand.nextInt(101));
        }
    }

    public static int findMax(int[] arr){
        int[] arr = new int[10];
        int max =arr[0];
        for(int i = 0; i<10; i++){
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }

    public static int findMin(int[] arr){
        int[] arr = new int[10];
        int min=arr[0];
        for(int i = 0; i<10; i++){
            if(arr[i]<min)
                min=arr[i];
        }
        return min;
    }
}
