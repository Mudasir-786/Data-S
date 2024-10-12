public class T1 {

    class Node {
        String name;
        Node prev, next;

        Node(String name) {
            this.prev = null;
            this.next = null;
            this.name = name;
        }
    }

    public class Dll {
        Node head;
        public void Addfirst(String name) {
            Node newnode = new Node(name);
            if (head == null) {
                head = newnode;
            } else {
                newnode.next = head;
                head.prev = newnode;
                head = newnode;
            }
        }
        public void Addlast(String name) {
            Node newnode = new Node(name);
            if (head == null) {
                head = newnode;
                return;
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
            newnode.prev = temp;
        }

        public void AddafterName(String name, Node node) {
            Node temp = head;
            while (temp != null && !temp.name.equals(name)) {
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Node with name " + name + " not found");
                return;
            }
            node.next = temp.next;
            node.prev = temp;

            if (temp.next != null) {
                temp.next.prev = node;
            }
            temp.next = node;
        }
        public void AddBeforeName(String name, Node node) {
            Node temp = head;
            while (temp != null && !temp.name.equals(name)) {
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Node with name " + name + " not found");
                return;
            }
            node.next = temp;
            node.prev = temp.prev;

            if (temp.prev != null) {
                temp.prev.next = node;
            } else {
                head = node;
            }
            temp.prev = node;
        }

        public void makeCircular() {
            if (head == null) {
                return;
            }
            Node tail = head;
            while (tail.next != null) {
                tail = tail.next;
            }
            tail.next = head;
            head.prev = tail;
        }
        public void Print() {
            Node temp = head;
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            while (temp != null) {
                System.out.print(temp.name + " -> ");
                temp = temp.next;
            }
            System.out.println("Null");
        }
    }

    public static void main(String[] args) {
        T1 outer = new T1();  
        Dll list = outer.new Dll(); 

        list.Addfirst("c");
        list.Addfirst("b");
        list.Addfirst("a");

        list.Print(); 

        list.Addlast("d");
        list.Print(); 

        
        Node newNode = outer.new Node("e");
        list.AddafterName("c", newNode);
        list.Print();  

        Node newNode2 = outer.new Node("x");
        list.AddBeforeName("b", newNode2);
        list.Print(); 
 
        list.makeCircular();
        System.out.println("List has been made circular");
    }}
