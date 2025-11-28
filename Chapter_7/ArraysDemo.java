import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0};

        display("Original array:", arr);

        Arrays.fill(arr, 8);
        display("After filling with 8s:", arr);

        arr[1] = 6;
        arr[3] = 3;
        display("After changing two values:", arr);

        Arrays.sort(arr);
        display("After sorting:", arr);
    }

    public static void display(String message, int array[]) {
        System.out.print(message + " ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
