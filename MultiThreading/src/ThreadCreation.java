class HelloWorldThread extends Thread {
    public void run() {
        System.out.println("Hello World");
    }


    public static void main(String[] args) {
        HelloWorldThread myThread = new HelloWorldThread();
        myThread.start();
    }
}
