public class NearestNeighbors {
    public static int nearestNeighbors(double arr[], int n) {
        int firstIndex = 0;

        if (n < 2) {
            System.out.println("The array should have a minimum of two elements");
            return -1;
        } else {
            double minDistance = Math.abs(arr[1] - arr[0]);

            for (int i = 0; i < n - 1; i++) {
                double distance = Math.abs(arr[i + 1] - arr[i]);
                if (distance < minDistance) {
                    minDistance = distance;
                    firstIndex = i;
                }
            }
        }
        return firstIndex;
    }
}