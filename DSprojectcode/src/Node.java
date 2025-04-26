
public class Node<T> {

    public T data;
    public Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList<T> {

    private Node<T> head;
    private Node<T> current;

    public LinkedList() {
        head = current = null;
    }

    // Check if the list is empty
    public boolean empty() {
        return head == null;
    }

    // Check if current node is the last node
    public boolean last() {
        return current.next == null;
    }

    // Linked list is never full
    public boolean full() {
        return false;
    }

    // Move current to the first node
    public void findFirst() {
        current = head;
    }

    // Move current to the next node
    public void findNext() {
        current = current.next;
    }

    // Retrieve data from the current node
    public T retrieve() {
        return current.data;
    }

    // Update data of the current node
    public void update(T d) {
        current.data = d;
    }

    // Insert a new node after the current node
    public void insert(T d) {
        Node<T> newnode = new Node<T>(d);
        if (head == null) {
            head = newnode;
            current = newnode;
        } else {
            newnode.next = current.next;
            current.next = newnode;
            current = newnode;
        }
    }

    // Remove the current node
    public void remove() {
        if (head == current) {
            head = head.next;
            current = head;
            return;
        } else {
            Node<T> p = head;
            while (p.next != current)
                p = p.next;
            p.next = current.next;
        }

        if (current != null && current.next != null)
            current = current.next;
        else
            current = head;
    }

    // Display all nodes in the list
    public void display() {
        if (head == null)
            System.out.println("Empty List");
        Node<T> p = head;
        while (p != null) {
            System.out.println(p.data + "  ");
            p = p.next;
        }
    }
}
