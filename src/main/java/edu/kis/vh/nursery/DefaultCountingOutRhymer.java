package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
	StackInterface intArrayStack = new IntArrayStack();

	public DefaultCountingOutRhymer() {
	}
	public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
		this.intArrayStack = intArrayStack;
	}



	public void push(int in) {
		intArrayStack.push(in);
	}

	public boolean callCheck() {
		return intArrayStack.callCheck();
	}

	public boolean isFull() {
		return intArrayStack.isFull();
	}

	public int top() {
		return intArrayStack.top();
	}

	public int countOut() {
		return intArrayStack.pop();
	}
}