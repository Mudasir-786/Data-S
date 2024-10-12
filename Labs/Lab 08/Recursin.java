 class Recursin{
    public static void DecimalToBinary(int N){
        if(N==0){
            return;
       }
       else{
        // int B=N%2;
        // return DecimalToBinary(N%2);
        DecimalToBinary(N/2);
        System.out.print(N%2);
        

       }

    }
    public static void main(String[] args) {
        int N=13;
        System.out.println("the Decimal Number is :"+N);
        System.out.println("the Binary Number is");
        DecimalToBinary(N);
        
        
    }
 }