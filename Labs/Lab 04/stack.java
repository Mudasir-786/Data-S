public class stack {
 private int arr[];
 private int top;
 private int capacity;

  stack(int size)
  {
    arr = new int[size];
    capacity = size;
    top = -1;
  }
  public void push(int x)
 {
    if(isFull()){
        System.out.println("stack is overflow");
        return;

    }
    arr[++top]=x;
    System.out.println("Pushed ->"+x); 
}

public int Pop(){
    if(isEmpty()){
        System.out.println("stack is empty");
        return -1;

    }
    
    System.out.println("Pop ->"+arr[top]);
    return arr[top--];

}
public int top(){
    if(isEmpty()){
        return arr[top];

    }
    System.out.println("stack is empty ");
    return -1;
   
}
public int size(){
    return top+1;

}
public Boolean isEmpty(){
    return top==-1;

}
public Boolean isFull(){
    return top==capacity-1;

}
public static void main(String[] args) {
    stack s= new stack(3);
 s.push(1); 
 s.push(2); 
 s.Pop(); 
 s.Pop(); 
 s.push(3); 
 System.out.println("Top element is: " + s.top());
 System.out.println("Stack size is " + s.size());
 s.Pop(); 
 
 if (s.isEmpty())
 System.out.println("Stack Is Empty");
 else
 System.out.println("Stack Is Not Empty");
 }
}

    





    
