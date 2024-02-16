import java.util.Scanner;

public class Input {
    public static double[] getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements of array: ");
        int n = scanner.nextInt();
        double arr[] = new double[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
        }

        System.out.println("The elements of the array are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        scanner.close();
        return arr;
    }
}