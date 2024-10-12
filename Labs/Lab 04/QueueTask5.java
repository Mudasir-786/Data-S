
public class QueueTask5 extends StackTask2{
     StackTask2 s1=new StackTask2();
    StackTask2 s2=new StackTask2();

      public  boolean isEmpty(){
        return s1.isEmpty() && s2.isEmpty();
    }
     public void enqueue(int x){
        s1.Push(x);
       }
       public int dequeue(){
        while(!s1.isEmpty()){
            s2.Push(s1.Pop());
        }
        int s=s2.Pop();
        while(!s2.isEmpty()){
            s1.Push(s2.Pop());
        }
        return s;
    }
    public static void main(String[] args) {
        QueueTask5 tt=new QueueTask5();
        tt.enqueue(1);
        tt.enqueue(2);
        tt.enqueue(3);
        System.out.println("Dequeue->"+tt.dequeue());
        System.out.println("Dequeue->"+tt.dequeue());
        System.out.println("Dequeue->"+tt.dequeue());
        System.out.println("Dequeue->"+tt.dequeue());

    }
}

 

 