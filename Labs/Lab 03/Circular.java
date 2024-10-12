public class Circular {
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
    public void Addfir(int data){
    
        Node newnode=new Node(data);
        if(head==null){
            head=newnode; 
            tail=newnode;
            
            return;
        }else{
        newnode.next=head;
        head=newnode;
        tail.next=head;
        }
       
        
    }
    public void addlast(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
            tail.next=head;
            return;
        }
        tail.next=newnode;
        tail=newnode;
        tail.next=head;

    }
    public void RemoveFirst(){
        if(head==null){
            System.out.println("...The list is empty...");
            return;
        }
        head=head.next;
        tail.next=head;
    }
    public void RemoveLast(){
        if(head==null){
            System.out.println("...The list is empty...");
            return;
        }
        Node temp=head;
        while(temp.next!=tail){
            temp= temp.next;
        }
        temp.next=head;
        tail=temp;
       
    }
    public void Print(){
        if(head==null){
            System.out.println("....ThE LiSt Is EmPtY...");
            return;
        }
        Node CurrNode=head;
        do{
            System.out.print(CurrNode.data+"->");
            CurrNode=CurrNode.next;
         }
        while(CurrNode!=head);
            
        
        System.out.println("Head");
    }
        public static void main(String[] args) {
        Circular CC=new Circular();
        CC.Addfir(2);
        CC.Addfir(1);
        CC.Addfir(4);
        CC.Addfir(5);

        CC.addlast(8);
        CC.addlast(10);
       System.out.println("..after adding first and last side...");
        CC.Print();

        CC.RemoveFirst();
        CC.RemoveLast();

        System.out.println("...after removing from first and last side..");
        CC.Print();
    }  
    
    
}
