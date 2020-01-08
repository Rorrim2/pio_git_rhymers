package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int twelve = 12;
    private static final int eleven = 11;
    private static final int minus_one = -1;
    private int[] NUMBERS = new int[twelve];

    public final int getTotal() {
        return total;
    }

    private int total = minus_one;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    boolean callCheck() {
        return total == minus_one;
    }

    boolean isFull() {
        return total == eleven;
    }

    final int peekaboo() {
        if (callCheck())
            return -1;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return NUMBERS[total--];
    }

}
