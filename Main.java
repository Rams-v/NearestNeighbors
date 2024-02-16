public class Main {
    public static void main(String[] args) {
        double[] arr = Input.getInput();
        int index = NearestNeighbors.nearestNeighbors(arr, arr.length);

        if (index != -1) {
            System.out.println("The index of the first number with the minimum distance is: " + index);
        }
    }
}
