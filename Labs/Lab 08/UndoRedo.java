import java.util.*;


public class UndoRedo {
    private LinkedList<String> mainList=new LinkedList<>();  
    private LinkedList<String> undoStack  = new LinkedList<>();  
    private LinkedList<String> redoStack  = new LinkedList<>();   

    // Insert an item into the main list
    public void insert(String action) {
        mainList.add(action); // Add to the front of the list
        undoStack.push(action); // Push to undo stack
        redoStack.clear(); // Clear redo stack since a new action was taken
    }

    // Undo the last action
    public void undo() {
        if (!undoStack.isEmpty()) {
            String lastAction = undoStack.removeFirst(); // Remove from undo stack
            mainList.remove(lastAction); // Remove from the main list
            redoStack.addFirst(lastAction); // Push to redo stack
            System.out.println("Undo successful");
        } else {
            System.out.println("Nothing to undo!");
        }
    }

    // Redo the last undone action
    public void redo() {
        if (!redoStack.isEmpty()) {
            String lastUndoneAction = redoStack.removeFirst(); // Remove from redo stack
            mainList.addFirst(lastUndoneAction); // Add back to main list
            undoStack.addFirst(lastUndoneAction); // Push back to undo stack
            System.out.println("Redo successful");
        } else {
            System.out.println("Redo unsuccessful");
        }
    }

    // Display the current list (actions taken so far)
    public void display() {
        if (mainList.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("Current list: " + mainList);
        }
    }

    public static void main(String[] args) {
        UndoRedo ur = new UndoRedo();
        Scanner scanner = new Scanner(System.in);
        int choice;
        String input;

        while (true) {
            System.out.println("\nPlease enter your choice: (1 for insert, 2 for undo, 3 for redo, 4 for display, 5 to exit)");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Input: ");
                    input = scanner.nextLine();
                    ur.insert(input);
                    break;
                case 2:
                    ur.undo();
                    break;
                case 3:
                    ur.redo();
                    break;
                case 4:
                    ur.display();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
