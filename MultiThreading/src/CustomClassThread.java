class MyCustomClass {
    private String message;

    public MyCustomClass(String message) {
        this.message = message;
    }

    public void displayMessage() {
        System.out.println("Custom message: " + message);
    }
}

class CustomClassThread extends MyCustomClass implements Runnable {
    public CustomClassThread(String message) {
        super(message);
    }

    public void run() {
        displayMessage();
    }

    public static void main(String[] args) {
        Thread myThread = new Thread(new CustomClassThread("Hello World"));
        myThread.start();
    }
}
