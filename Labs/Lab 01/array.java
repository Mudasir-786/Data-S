import java.util.Scanner;

public class array{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int[] numbers = new int[10];
        int left = 0, right = 9;
        
        System.out.println("Enter 10 integers:");
        
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            
            
            if (num % 2 != 0) {
                numbers[left++] = num;
            } else {
                numbers[right--] = num;
            }
        }
        
        
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
