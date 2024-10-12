public class Length {
    Node head;
    class Node{
        int data;
        Node next;
   
        Node(int data){
           this.data=data;
           this.next=null;
        }
       
   }
   public void add(int data){
       Node NewNode=new Node(data);
       if(head==null){
           head=NewNode;
           return;
       }
       Node CurrNode=head;
       while(CurrNode.next !=null){
           CurrNode=CurrNode.next;
       }
       CurrNode.next=NewNode;
   }
   public int len(){

    Node temp=head;
    int length=0;
    while(temp!=null){
        length++;
        temp=temp.next;
    }
    return length;
    
   }
   public static void main(String[] args) {
    Length le =new Length();
    le.add(6);
    le.add(1);
    le.add(4);
    le.add(7);
    le.add(9);
    le.add(3);
    le.add(2);
    System.out.println("***The length of LinkedList is:"+le.len()+"****");
   }
    
}
