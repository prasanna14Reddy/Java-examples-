public class RunnableExample {

    public static void main(String[] args) {
        // Create a Runnable object
        Runnable runnableTask = new Task();

        // Create a Thread object and pass the Runnable object to it
        Thread thread = new Thread(runnableTask);

        // Start the thread
        thread.start();

        // Main thread continues running
        System.out.println("Main thread continues to run...");
    }
}

// Task class implements Runnable interface
class Task implements Runnable {

    @Override
    public void run() {
        try {
            // Print a message before sleeping
            System.out.println("Thread is going to sleep for 3 seconds...");

            // Sleep for 3 seconds
            Thread.sleep(3000);

            // Print a message after waking up
            System.out.println("Thread has woken up after sleeping.");
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted while sleeping.");
            e.printStackTrace();
        }
    }
}
