package week_7.hometask.mylinkedlist;

import java.util.NoSuchElementException;

public class MyLinkedList<T> {

    private Node first;
    private int size = 0;

    public int size() {
        return size;
    }

    public void add(T arg) {
        Node n = new Node(arg);
        if (first == null) {
            first = n;
        } else {
            Node current = first;
            while(current.next != null) {
                current = current.next;
            }
            current.next = new Node(arg, null);
        }
        size++;
    }

    public void add(T arg, int index) {
        Node n = new Node(arg);
        if (index < 0 || index > size) {
           throw new IndexOutOfBoundsException();
        } else if (index == 0){
            Node second = first;
            first = n;
            first.next = second;
        } else if (index == size) {
            add(arg);
        } else {
            Node current = first;
            Node previous = null;
            for (int i = 0; i < index; i++) {
                previous = current;
                current = current.next;
            }
            previous.next = n;
            n.next = current;
        }
        size++;
    }

    public void remove() {
        if (first.next == null) {
            clear();
        } else removeFirst();
    }

    public void removeFirst() {
        first = first.next;
        size--;
    }

    public void clear() {
        first = null;
        size = 0;
    }

    public T getFirst() {
        if (first == null) {
            throw new NoSuchElementException();
        }
        return first.value;
    }

    public void revertNode(){
        Node prev = null;
        Node curr = first;
        Node next = null;
        while (curr != null){
            next = curr.next;
            curr.next = prev; //reversing here
            prev = curr;
            curr = next;
        }
        first = prev;
    }

//    public static Node addToTale(Node existingNode, Node tale){
//        // TODO: 06.11.2018 add new method to add node to tale;
//        return null;
//    }
//
    public static Node addToHead(Node head, Node nodeToAdd){
        // TODO: 06.11.2018 add new method to add node to head;
        return null;
    }

    private class Node {
        private T value;
        private Node next;

        public Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(T value) {
            this.value = value;
        }
    }

    @Override
    public String toString() {
        String listRepresentation = "[ ";
        Node currentNode = first;
        while (currentNode != null) {
            listRepresentation += currentNode.value + " ";
            currentNode = currentNode.next;
        }
        listRepresentation += "]";

        return listRepresentation;
    }
}
