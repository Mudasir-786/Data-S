public class FabSeries {
    public static void iterative(int N){
        int a = 0, b = 1, next;
        if (N <= 0) {
            return;
        }
        System.out.println("In ItRaTiVe FoRm");
        System.out.print(a + " ");
        
        for (int i = 1; i < N; i++) {
            System.out.print(b + " ");
            next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
    
    
      public static int  Recursive(int N){
        if (N<=1){
            return N;
        }
        return Recursive(N-1)+Recursive(N-2);

    }
    public static void  printRecursive(int N){
        System.out.println("In ReCuRsIvE FoRm");
      for(int i=0;i<N;i++){
        
        System.out.print(Recursive(i)+" ");
      }
    }
    
    public static void main(String[] args) {
        int N = 10;
        iterative(N);
        // printRecursive(N);
        long startTimeIterative = System.nanoTime();
        Recursive(N);
        long endTimeIterative = System.nanoTime();
        long iterativeTime = endTimeIterative - startTimeIterative;

        long startTimeRecursive = System.nanoTime();
        printRecursive(N);
        long endTimeRecursive = System.nanoTime();
        long recursiveTime = endTimeRecursive - startTimeRecursive;

        System.out.println("\nTime taken by Iterative approach: " + iterativeTime + " nanoseconds");
        System.out.println("Time taken by Recursive approach: " + recursiveTime + " nanoseconds");


        if (iterativeTime < recursiveTime) {
            System.out.println("Iterative approach is faster.");
        } else {
            System.out.println("Recursive approach is faster.");
        }

      
    }
}


    

