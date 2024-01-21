class EvenOddThread implements Runnable {
    private int start;
    private int end;

    public EvenOddThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        String threadType = (start % 2 == 0) ? "Even" : "Odd";

        for (int i = start; i <= end; i += 2) {
            System.out.println(threadType + ": " + i);
        }
    }

    public static void main(String[] args) {
        Thread evenThread = new Thread(new EvenOddThread(2, 20));
        Thread oddThread = new Thread(new EvenOddThread(1, 19));

        evenThread.start();
        oddThread.start();
    }
}
