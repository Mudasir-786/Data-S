public class NLArray {
    public static void main(String[] args) {
        int array[][]={{1,2,3,4,5},{6,7,8,9,10}, {11,12,13,14,15},
         {16,17,18,19,20},{21,22,23,24,25}};
        cropCenterPart(array);
    }
    public static void cropCenterPart(int[][] arr) {
        System.out.println("......Center Part:......");

        int rows = arr.length;
        int cols = arr[0].length;

       
        for (int i = 1; i < rows - 1; i++) {
            for (int j = 1; j < cols - 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}