 public class QueueTask4 {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    private Node rear = null, front = null;
    public  int dequeue() {
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int k=front.data;
        // System.out.println("Removing ->"+k);
        front=front.next;
        return k;
    }
public  void enqueue(int data){
    Node NewNode=new Node(data);
    if(rear==null){
    front=rear=NewNode;

    }else{
        rear.next=NewNode;
        rear=NewNode;
    }
    // System.out.println("Inserting ->"+data);


}
public  int peek(){
    if(front!=null){
        return front.data;
    }
    System.out.println("Queue is Empty");
    return -1;

}
public  boolean isEmpty(){
    if(front==null){
        return true;
    }
    return false;
}
public static void main(String[] args) {
    QueueTask4 q = new QueueTask4();
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



    

