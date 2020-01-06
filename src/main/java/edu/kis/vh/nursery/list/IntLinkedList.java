package edu.kis.vh.nursery.list;

/**
 * Class representing integer linked list with nodes
 */
public class IntLinkedList {

    private Node last;
    private int i;

    /**
     * Method that pushes a given variable to the linked list
     * @param i value to push to the list
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    /**
     * Method checking if the list is empty
     * @return true if list is empty or true otherwise
     */
    private boolean isEmpty() {
        return last == null;
    }

    /**
     * Method checking if the list is full
     * @return false
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Method returning last value in list
     * @return -1 when it's empty or top value
     */
    public int top() {
        if (isEmpty())
            return -1;
        return last.value;
    }

    /**
     * Method deleting last value from list and returning it's value
     * @return -1 when it's empty or top value
     */
    public int pop() {
        if (isEmpty())
            return -1;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
