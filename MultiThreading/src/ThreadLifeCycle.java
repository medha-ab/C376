public class ThreadLifeCycle {

    static class CustomThread extends Thread {
        @Override
        public void run() {
            // Running state
            System.out.println("Thread is in RUNNING state");

            // Simulate some work
            try {
                sleep(1000); // Simulate work for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Waiting state
            System.out.println("Thread is in WAITING state");

            synchronized (this) {
                try {
                    this.wait(); // Thread goes into WAITING state
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // Timed Waiting state
            System.out.println("Thread is in TIMED_WAITING state");

            try {
                sleep(2000); // Simulate work for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Blocked state
            System.out.println("Thread is in BLOCKED state");

            // Simulate some work
            try {
                sleep(1000); // Simulate work for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Terminated state
            System.out.println("Thread is in TERMINATED state");
        }
    }

    public static void main(String[] args) {
        CustomThread customThread = new CustomThread();

        // New state
        System.out.println("Thread is in NEW state");

        // Start the thread
        customThread.start();

        try {
            // Main thread goes to sleep to allow the customThread to progress through states
            Thread.sleep(500);

            // Runnable state
            System.out.println("Thread is in RUNNABLE state");

            // Interrupt the waiting thread to transition from WAITING to RUNNABLE state
            synchronized (customThread) {
                customThread.notify();
            }

            // Main thread goes to sleep to allow the customThread to progress through states
            Thread.sleep(500);

            // Transition from TIMED_WAITING to RUNNABLE state
            customThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
