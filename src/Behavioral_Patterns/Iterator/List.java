package Behavioral_Patterns.Iterator;

import java.util.Iterator;

class List<T> implements Iterable<T> {
    Node<T> head, tail;

    public void add(T data) {
        Node<T> node = new Node<>(data, null);
        if (head == null)
            tail = head = node;
        else {
            tail.setNext(node);
            tail = node;
        }
    }

    public Node<T> getHead() {
        return head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public Iterator<T> iterator() {
        return new ListIterator<T>(this);
    }
}
