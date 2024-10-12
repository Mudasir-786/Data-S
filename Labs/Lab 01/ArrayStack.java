public class ArrayStack {
    int size=5;
    int data;
    int arr[]=new int[size];
    int temp=0;
     public void Push(int data){
        if(temp==arr[size]){
            System.out.println("the Stack is Full");
            return ;
        }
        arr[temp++]=data;
    }
    
    
}
