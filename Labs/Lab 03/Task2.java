public class Task2 {
    Node head;
    Node tail;
    class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
            this.next=null;
          }
    }
    public void AddFirst(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
      }
     public void AddLast(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
     } 
     public void RemoveFirst(){
        if(head==null){
            System.out.println("...The List is Empty...");
            return;
        }
        head=head.next;
     }
   
public void RemoveLast(){
    if(head==null){
        System.out.println("....The list is Empty...");
        return;
    }
   Node temp=head;
   while(temp.next!=tail){
    temp=temp.next;
}
tail=temp;
tail.next=null;
}
public void Print(){
    if(head==null){
    System.out.println("..the lisst is empty...");
    return;
}
Node temp=head;
while(temp!=null){
    System.out.print(temp.data+"->");
    temp=temp.next;
}
System.out.println("NULL");
}
        public static void main(String[] args) {
        Task2 tt=new Task2();
        tt.AddFirst(6);
        tt.AddFirst(1);
        tt.AddFirst(4);

       
        tt.AddLast(9);
        tt.AddLast(7);


      System.out.println(">>>After adding Node from Beginning and ending<<<<");
        tt.Print();


        tt.RemoveFirst();
        tt.RemoveLast();
        System.out.println(">>>After Removing  Node from Beginning and ending<<<<");
        tt.Print();
    }
    
}
