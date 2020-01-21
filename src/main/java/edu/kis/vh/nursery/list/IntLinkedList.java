package edu.kis.vh.nursery.list;

import edu.kis.vh.nursery.StackInterface;

/**
 * Class representing integer linked list with nodes
 */
public class IntLinkedList implements StackInterface {

	public static final int NEGATIVE = -1;
	Node last;

    /**
     * Method that pushes a given variable to the linked list
     * @param i value to push to the list
     */
	@Override
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
	@Override
	public boolean isEmpty() {
		return last == null;
	}
	
	/**
     * Method checking if the list is full
     */
	@Override
	public boolean isFull() {
		return false;
	}
	
	

	 /**
     * Method returning last value in list
     * @return -1 when it's empty or top value
     */
	@Override
	public int top() {
		if (isEmpty())
			return NEGATIVE;
		return last.getValue();
	}

	
    /**
     * Method deleting last value from list and returning it's value
     * @return -1 when it's empty or top value
     */
	@Override
	public int pop() {
		if (isEmpty())
			return NEGATIVE;
		int ret = last.getValue();
		last = last.prev;
		return ret;
	}



	@Override
	public boolean callCheck() {
		return false;
	}


}