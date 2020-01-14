package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int MAX_SIZE = 12;
	public static final int LAST_ELEMENT = 11;
	public static final int EMPTY = -1;

	private final int[] numbers = new int[MAX_SIZE];
	private final int INITIAL = -1;
	public int total = INITIAL;

	public void countIn(int in) {
		if (!isFull())
			numbers[LAST_ELEMENT] = in;
	}
	public boolean callCheck() {
			return total == INITIAL;
		}
	public boolean isFull() {
				return total == LAST_ELEMENT;
			}
	protected int peekaboo() {
		if (callCheck())
			return EMPTY;
		return numbers[total];
	}
	public int countOut() {
		if (callCheck())
			return EMPTY;
		return numbers[total--];
	}
}