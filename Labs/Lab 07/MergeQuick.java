public class MergeQuick {
    public static void quicksort(int arr[], int high, int low){
        
    }
    public static void Divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        Divide(arr, si, mid);
        Divide(arr, mid + 1, ei);
        conquer(arr, si, ei, mid);
    }

    public static void conquer(int arr[], int si, int ei, int mid) {
        int merged[] = new int[ei - si + 1];
        int index1 = si;
        int index2 = mid + 1;
        int x = 0;

        // Merging the two sorted halves
        while (index1 <= mid && index2 <= ei) {
            if (arr[index1] <= arr[index2]) {
                merged[x++] = arr[index1++];
            } else {
                merged[x++] = arr[index2++];
            }
        }

        // Copy remaining elements of left half
        while (index1 <= mid) {
            merged[x++] = arr[index1++];
        }

        // Copy remaining elements of right half
        while (index2 <= ei) {
            merged[x++] = arr[index2++];
        }

        // Copy merged array back into the original array
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 7, 5, 9, 8};
        Divide(arr, 0, arr.length - 1);

        // Printing the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
