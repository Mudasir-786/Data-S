import java.util.*;
class Recursion{
    public static void Assending(int n){
        if(n==0){
            return;
        }
        Assending(n-1);
        System.out.print(n+" ");
    }
    public static void Desending(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        Desending(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("***EnTeR VaLuE oF N****");
        int N=sc.nextInt();
        // System.out.println("EnTeR VaLuE oF N"+n);

        System.out.println("***liSt oF AsSeNdInG OrDeR****");
        Assending(N);
        System.out.println();

        System.out.println("***liSt oF DeSeNdInG OrDeR****");
        Desending(N);
        
    }

}