public class ThreadLifeCycle {

    public static void main(String[] args) {
        // Creating a new thread
        Thread myThread = new Thread(() -> {
            // Runnable state
            printState("Runnable");

            // Simulating some processing
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Blocked state (synchronized block)
            synchronized (ThreadLifeCycle.class) {
                printState("Blocked (synchronized block)");
            }

            // Waiting state
            try {
                Object lock = new Object();
                synchronized (lock) {
                    printState("Waiting");
                    lock.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Timed Waiting state
            try {
                printState("Timed Waiting");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // New state
        printState("New");

        // Starting the thread
        myThread.start();

        // Allow some time for the thread to complete
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Notify and Terminate the thread
        synchronized (myThread) {
            myThread.notify();
        }

        // Terminated state
        printState("Terminated");
    }

    private static void printState(String state) {
        System.out.println("Thread is in the " + state + " state.");
    }
}
