import java.util.*;
public class Task3 {
    private LinkedList<String> mainlist=new LinkedList<>();
    private LinkedList<String> undoStack=new LinkedList<>();
    private LinkedList<String> redoStack=new LinkedList<>();

    public  void insert(String str){
        mainlist.add(str);
        undoStack.push(str);
        redoStack.clear();

    }
    public void undo(){
     if(!undoStack.isEmpty()){
        String  lastaction=undoStack.removeFirst();
        mainlist.remove(lastaction);
        redoStack.addFirst(lastaction);
        System.out.println("redo successful");
}else{
System.out.println("redo unsuccessful");
}


    }
public void redo(){
    if(!redoStack.isEmpty()){
        String lastaction=redoStack.removeFirst();
        mainlist.addFirst(lastaction);
        redoStack.addFirst(lastaction);
        System.out.println("redo Successful");
    }
    System.out.println("redo Unsuccessful");
}

public void display(){
     if(mainlist.isEmpty()){
        System.out.println("list is empty");
     } 
     else{
        System.out.println("the list is "+mainlist);
     } 
}

    public static void main(String[] args) {
        Task3 tt=new Task3();
        Scanner sc=new Scanner(System.in);
        sc.nextLine();
        int choice;
        String input;
        while()

        switch(choice);

      
    }
    
}
