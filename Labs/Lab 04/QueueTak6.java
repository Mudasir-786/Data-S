public class QueueTak6 extends QueueTask4 {
    QueueTask4 q1 = new QueueTask4();
    QueueTask4 q2 = new QueueTask4();

    public boolean isEmpty() {
        return q1.isEmpty() && q2.isEmpty();
    }

    public void Push(int data) {
        if (q2.isEmpty()) {
            q1.enqueue(data);
        } else {
            q2.enqueue(data);
        }
    }

    public int Pop() {
        if (isEmpty()) {
            System.out.println("The list is empty");
            return -1;
        }

        int top = -1;

        if (!q1.isEmpty()) {
            while (!q1.isEmpty()) {
                top = q1.dequeue();
                if (!q1.isEmpty()) {
                    q2.enqueue(top);
                }
                else{
                    break;
                }
            }
        } else {
            while (!q2.isEmpty()) {
                top = q2.dequeue();
                if (!q2.isEmpty()) {
                    q1.enqueue(top);
                }
                else{
                    break;
                }
            }
        }

        return top;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("The list is empty");
            return -1;
        }

        int top = -1;

        if (!q1.isEmpty()) {
            while (!q1.isEmpty()) {
                top = q1.dequeue();
                q2.enqueue(top);
            }
        } else {
            while (!q2.isEmpty()) {
                top = q2.dequeue();
                q1.enqueue(top);
            }
        }

        return top;
    }

    public static void main(String[] args) {
        QueueTak6 qq = new QueueTak6();
        qq.Push(1);
        qq.Push(2);
        qq.Push(3);
        System.out.println("remove -> " + qq.Pop()); // Expected: 3
        System.out.println("remove -> " + qq.Pop()); // Expected: 2
        System.out.println("remove -> " + qq.Pop()); // Expected: 1
        System.out.println("remove -> " + qq.Pop()); // Expected: -1 (empty)
    }
}
