public class Factorial {
    public static int Fact(int N){
        if(N<=1){
            return N;
        }
        return N*Fact(N-1);

        
    }
    public static void fact(int N){
        long factorial=1;
        for(int i=1;i<=N;i++){
            factorial=factorial*i;
           }
        System.out.println("the factorial of -> "+N+" is -> "+factorial);
        
    }
    
     public static void main(String[] args) {
       int N=5;
       System.out.println("***through Recursive***");
       System.out.println("ThE FaCtOrIaL oF  ->  "+N+"  is->   "+Fact(N));

       System.out.println("*** throuh itrative***");
       fact(N);
    //    System.out.println("the factorial of"+N+"is"+factorial);

      
    long startTimeIterative = System.nanoTime();
    long iterativeResult =Fact(N);
    long endTimeIterative = System.nanoTime();
    long iterativeTime = endTimeIterative - startTimeIterative;

    long startTimeRecursive = System.nanoTime();
    long recursiveResult = Fact(N);
    long endTimeRecursive = System.nanoTime();
    long recursiveTime = endTimeRecursive - startTimeRecursive;



    System.out.println("\nTime taken by Iterative approach: " + iterativeTime + " nanoseconds");
    System.out.println("Time taken by Recursive approach: " + recursiveTime + " nanoseconds");


    if (iterativeTime < recursiveTime) {
        System.out.println("Iterative approach is faster.");
    } else {
        System.out.println("Recursive approach is faster.");
    }

   // scanner.close();
}
}

    
   

