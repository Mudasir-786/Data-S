public class Pratice {
    Node head;
    
    class Node{
        Node next;
        int data;
        Node Prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.Prev=null;
        }
    }
    public void addFirst(int data){
        Node NewNode=new Node(data);
        if(head==null){
            head =NewNode;
            return;
        }
     NewNode.next=head;
     head.Prev=NewNode;
     head=NewNode;
   

    }
    public void LastAdd(int data){
        Node NewNode=new Node(data);
        if(head==null){
            head=NewNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=NewNode;


    }
    public void AddMiddle(int data){
        Node newNode =new Node(data);
        Node slow=head; Node fast=head;
        while(fast !=null  && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        newNode.next=slow.next;
        slow.next=newNode;
    }
    public void Removefirst(){
        if(head==null){
            System.out.println("...the list is empty..");
            return;
      }
      head=head.next;
      head.Prev=null;
    }
    public void Removelast(){
        if(head==null){
            System.out.println("...the list is empty...");
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public void Print(){
        if(head==null){
            System.out.println("....ThE LiSt Is EmPtY...");
            return;
        }
        Node CurrNode=head;
        while(CurrNode !=null){
            System.out.print(CurrNode.data+"->");
            CurrNode=CurrNode.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        Pratice PP=new Pratice(); 
        PP.addFirst(1);
        PP.addFirst(2);
        PP.addFirst(4);
        PP.addFirst(6);

        PP.LastAdd(7);
        PP.Removefirst();
        PP.Removelast();
        PP.AddMiddle(15);
        PP.Print();
    }



    
}
