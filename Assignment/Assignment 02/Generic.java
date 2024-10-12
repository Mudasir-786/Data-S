

class Generic<T> {
    T data;
    Generic<T> next;

    Generic(T data) {
        this.data = data;
        this.next = null;
    }
}
class List<T> {
    Generic<T> head;
    private int length = 0;

    List() { 
        this.head = null; 
    }

    void add(T data) {
        Generic<T> temp = new Generic<>(data);
        if (this.head == null) {
            head = temp;
        } else {
            Generic<T> X = head;
            while (X.next != null) {
                X = X.next;
            }
            X.next = temp;
        }
        length++;
    }

    void add(int position, T data) {
        if (position > length + 1) {
            System.out.println("Position Unavailable in LinkedList");
            return;
        }
        if (position == 1) {
            Generic<T> temp = head;
            head = new Generic<>(data);
            head.next = temp;
            length++;
            return;
        }

        Generic<T> temp = head;
        Generic<T> prev = null;

        while (position - 1 > 0 && temp != null) {
            prev = temp;
            temp = temp.next;
            position--;
        }

        if (prev != null) {
            Generic<T> newNode = new Generic<>(data);
            prev.next = newNode;
            newNode.next = temp;
            length++;
        }
    }

    void remove(T key) {
        Generic<T> prev = null;
        Generic<T> current = head;

        while (current != null && !current.data.equals(key)) {
            prev = current;
            current = current.next;
        }

        if (current != null) {
            if (prev != null) {
                prev.next = current.next;
            } else {
                head = current.next;
            }
            length--;
        } else {
            System.out.println("Given Value is not present in linked list");
        }
    }

    void clear() {
        head = null;
        length = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    int length() { 
        return this.length; 
    }

    @Override
    public String toString() {
        StringBuilder S = new StringBuilder("{ ");
        Generic<T> X = head;

        while (X != null) {
            S.append(X.data).append(" -> ");
            X = X.next;
        }

        if (S.length() > 2) {
            S.setLength(S.length() - 4); // Remove the last " -> "
        }

        S.append(" }");
        return S.toString();
    }
}

