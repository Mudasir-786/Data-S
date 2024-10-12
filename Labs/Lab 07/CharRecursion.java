public class CharRecursion {
    public static void Forword(char arr[], int index){
        if(index==arr.length){
            return;
        }
        System.out.print(arr[index]+" ");
        Forword(arr,index+1);

    }
    public static void BackWord(char arr[], int index){
        if(index<0){
            return;
        }
        System.out.print(arr[index]+" ");
        BackWord(arr, index-1);

    }
    public static void main(String[] args) {
        char arr[]={'A','B','C','D','E'};
        System.out.println("*** ThE FoRwOrD LiSt***");
        Forword(arr, 0);
        System.out.println();


        System.out.println("*** ThE BaCkwOrD LiSt***");
        BackWord(arr, 4);



    }
    
}
