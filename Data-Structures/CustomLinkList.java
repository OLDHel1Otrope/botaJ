package CustomImplementation;

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}

public class CustomLinkList<T> {
    int size;
    private Node<T> head;
    private Node<T> tail;

    public CustomLinkList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(T data) {
        if (head == null) {
            head = new Node<>(data);
            tail = head;
        } else {
            Node<T> newNode = new Node<>(data);
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void remove(int index) {
        if (index >= size || index < 0) return;
        if (index == 0) {
            if (size == 1) {
                head = null;
                tail = null;
            } else {
                head = head.next;
            }
        } else {
            Node<T> temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (index == size - 1) {
                tail = temp;
            }
        }
        size--;
    }

    public void display() {
        System.out.println(this.toString());
    }

    public String toString() {
        StringBuilder S = new StringBuilder();
        S.append("[");
        Node<T> temp = head;
        while (temp != null) {
            S.append(temp.data).append(", ");
            temp = temp.next;
        }
        if (size > 0) {
            S.setLength(S.length() - 2);  // Remove last comma and space
        }
        S.append("]");
        return S.toString();
    }

    public boolean contains(T obj) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data.equals(obj)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}
