class Node {
    int item; // Data of the node
    Node next; // Reference to the next node

    Node(int o) { // Constructor to initialize node with data
        item = o;
    }
}

class myList {
    Node first; // Reference to the first node in the list
    public static int size; // Variable to keep track of list size

    public myList() { // Constructor to initialize an empty list
        first = null; // Initially, the list is empty
        size = 0; // Size is zero when the list is empty
    }

    public Node newNode(int o) { // Create a new node with given data
        Node newNode = new Node(o); // Create a new node
        newNode.next = null; // Set its next reference to null
        return newNode;
    }

    // Method to insert an item at the beginning of the list
    public void insertFirst(int o) {
        Node newNode = newNode(o); // Create a new node with the given data
        newNode.next = first; // Set the next of the new node to the current first node
        first = newNode; // Update the first to point to the new node
        size++; // Increment the size of the list
    }

    // Method to insert an item at the end of the list
    public void insertLast(int o) {
        if (first == null) { // If the list is empty, insert at the beginning
            insertFirst(o);
            return;
        }

        Node newNode = newNode(o); // Create a new node with the given data
        Node current = first;
        while (current.next != null) { // Traverse the list to find the last node
            current = current.next;
        }
        current.next = newNode; // Set the next of the last node to the new node
        size++; // Increment the size of the list
    }

    // Method to insert an item after a specified item in the list
    public void insertAfter(int old, int o) {
        Node current = first;
        while (current != null) {
            if (current.item == old) { // Find the node with the specified data
                Node newNode = newNode(o); // Create a new node with the given data
                newNode.next = current.next; // Set the next of the new node
                current.next = newNode; // Set the next of the current node to the new node
                size++; // Increment the size of the list
                return;
            }
            current = current.next;
        }
    }

    // Method to insert an item before a specified item in the list
    public void insertBefore(int old, int o) {
        if (first == null) {
            return;
        }

        if (first.item == old) { // If the specified item is the first node, insert at the beginning
            insertFirst(o);
            return;
        }

        Node current = first;
        while (current.next != null) {
            if (current.next.item == old) { // Find the node before the specified item
                Node newNode = newNode(o); // Create a new node with the given data
                newNode.next = current.next; // Set the next of the new node
                current.next = newNode; // Set the next of the current node to the new node
                size++; // Increment the size of the list
                return;
            }
            current = current.next;
        }
    }

    public void insertOrdered(int o) {
        // Implement insertion in ascending order logic
    }

    public void deleteFirst() {
        if (first != null) {
            first = first.next;
            size--;
        }
    }

    public void deleteLast() {
        if (first == null || first.next == null) {
            deleteFirst();
            return;
        }

        Node current = first;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void deleteItem(int o) {
        if (first == null) {
            return;
        }

        if (first.item == o) {
            deleteFirst();
            return;
        }

        Node current = first;
        while (current.next != null) {
            if (current.next.item == o) {
                current.next = current.next.next;
                size--;
                return;
            }
            current = current.next;
        }
    }

    public boolean searchItem(int o) {
        Node current = first;
        while (current != null) {
            if (current.item == o) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int printFirst() {
        if (first != null) {
            return first.item;
        }
        return -1; // or any other appropriate value indicating no item
    }

    public int printLast() {
        if (first == null) {
            return -1; // or any other appropriate value indicating no item
        }

        Node current = first;
        while (current.next != null) {
            current = current.next;
        }
        return current.item;
    }

    public void printAll() {
        Node current = first;
        while (current != null) {
            System.out.print(current.item + " ");
            current = current.next;
        }
        System.out.println();
    }
}




