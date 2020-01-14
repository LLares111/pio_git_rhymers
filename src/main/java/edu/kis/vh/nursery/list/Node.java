package edu.kis.vh.nursery.list;

class Node {

    private int value;
    Node prev, next;

    Node(int i) {
        setValue(i);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
