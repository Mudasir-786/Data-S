// import java.util.Queue;

public class QueueTask3 {
    private int arr[];
    private int front;
    private int rear;
    private int capacity;
    private int count;
    QueueTask3(int size)
         {
     arr = new int[size];
     capacity = size;
     front = 0;
     rear = -1;
     count = 0;
          }
          public void enqueue(int item){
            if(isFull()){
                System.out.println("the Queue id over Flow");
                return;
               
            }
            rear=(rear+1)%capacity;
            arr[rear]=item;
            count++;
            System.out.println("Inserting->"+item);
        }
        public void dequeue(){
            if(isEmpty()){
                System.out.println("the Queue list is empty");
                return;
            }
            System.out.println("removing ->"+arr[front]);
            front=(front+1)%capacity;
            count--;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("the quenue is empty");
                return-1;

            }
            return arr[front];
        }
        public int size(){
            return count;
        }
        public Boolean isEmpty(){
           return (count==0);

        }
        public Boolean isFull(){
           return count==capacity;

        }
        public static void main(String[] args) {
            QueueTask3 q = new QueueTask3(5);
            
 q.enqueue(1);
 q.enqueue(2);
 q.enqueue(3);
 q.enqueue(4);
 System.out.printf("Front element is %d\n", q.peek());
 q.dequeue();
 q.dequeue();
 q.dequeue();
 q.dequeue();
 if (q.isEmpty()) {
 System.out.print("Queue is empty");
 } else {
 System.out.print("Queue is not empty");
 

    }
}
}
