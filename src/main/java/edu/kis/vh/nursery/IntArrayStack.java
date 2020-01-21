package edu.kis.vh.nursery;
import edu.kis.vh.nursery.StackInterface;

public class IntArrayStack implements StackInterface {

    public static final int MAX_SIZE = 12;
    public static final int LAST_ELEMENT = 11;
    public static final int EMPTY = -1;

    private final int[] numbers = new int[MAX_SIZE];
    private final int INITIAL = -1;
    public int total = INITIAL;
    @Override
    public void push(int in) {
        if (!isFull())
            numbers[LAST_ELEMENT] = in;
    }
    @Override
    public boolean callCheck() {
        return total == INITIAL;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isFull() {
        return total == LAST_ELEMENT;
    }


    @Override
    public int top() {
        if (callCheck())
            return EMPTY;
        return numbers[total];
    }
    @Override
    public int pop() {
        if (callCheck())
            return EMPTY;
        return numbers[total--];
    }
}