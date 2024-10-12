public class Linked {
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
public boolean search(int target){
    Node CurrNode=head;
    while(CurrNode !=null){
        if(CurrNode.data==target){
            return true;
          }
          else{
            CurrNode=CurrNode.next;
          }
           }
    return false;

}
public static void main(String[] args) {
    Linked ll = new Linked();
    ll.add(2);
    ll.add(5);
    ll.add(8);
    ll.add(7);
    ll.add(1);
    int target=7;
if(ll.search(target)){
    System.out.println(target+"->is Found in list ");
}
else{
    System.out.println(target+"-> is not Found in list");
}      
    }
    
}



    

