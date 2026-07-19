
public class LearningPractice {

    public static int linearSearch(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("Element found at index: " + i);
                return i;
            }
        }
        return -1;
    }

    public static int getLargestValue(int arr[]) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int binarySearch(int arr[], int i, int j, int x) {
        int mid = (i + j) / 2;
        if (arr[mid] == x) {
            return mid;
        } else if (arr[mid] > x) {
            return binarySearch(arr, i, mid - 1, x);
        } else {
            return binarySearch(arr, mid + 1, j, x);
        }
    }

    public static void reverseArray(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void pairsInArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int first = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int second = arr[j];
                System.out.println(first + " " + second);
            }
            System.out.println();
        }
    }

    public static void main() {
        int arr[] = {10, 20, 30, 40, 50};
        int returnValue = linearSearch(arr, 10);
        if (returnValue > -1) {
            System.out.println("Element found at index: " + returnValue);
        } else {
            System.out.println("Element not found");
        }

        int largestValue = getLargestValue(arr);
        System.out.println("Largest value: " + largestValue);

        int searchIndex = binarySearch(arr, 0, arr.length - 1, 20);
        System.out.println("Element found at index: " + searchIndex);

        reverseArray(arr);

        pairsInArray(arr);
    }
}
