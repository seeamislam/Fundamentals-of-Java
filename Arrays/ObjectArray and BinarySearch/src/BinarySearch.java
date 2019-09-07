import java.util.Arrays; // import array class with methods

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 15, 22, 35};

        Arrays.sort(arr); // sorts the array in ascending order
        // Arrays.sort is a method from the Arrays class that we imported

        int key = 22;
        int res = Arrays .binarySearch(arr, key); // locates the index of KEY inside arr

        System.out.println(res);

    }
}
