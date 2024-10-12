import java.util.Arrays;

public class Margesort {

    public void mergeSort(int[] array) {
        int n = array.length;

        
        for (int i = 1; i <= n - 1; i = 2 * i) {
            
            for (int si = 0; si < n - 1; si += 2 * i) {
                          int mid = Math.min(si + i - 1, n - 1);      
                int rightEnd = Math.min(si + 2 * i - 1, n - 1); 

                merge(array, si, mid, rightEnd);  
            }
        }
    }

    private void merge(int[] array, int si, int mid, int ei) {
        int n1 = mid - si + 1; 
        int n2 = ei - mid;    
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

       
        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[si + i];
        }

        
        for (int j = 0; j < n2; j++) {
            rightArray[j] = array[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = si;

        
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k++] = leftArray[i++];
        }

   
        while (j < n2) {
            array[k++] = rightArray[j++];
        }
    }

    public static void main(String[] args) {
        Margesort sorter = new Margesort();
        int[] array = { 12, 11, 13, 5, 6, 7 };
        System.out.println("Given Array: " + Arrays.toString(array));

        sorter.mergeSort(array);

        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}
