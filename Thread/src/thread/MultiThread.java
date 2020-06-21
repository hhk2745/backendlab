package thread;

public class MultiThread {
    /**
     * 4 Thread start, end
     */
    MultiThread() {
        Thread thread1 = new MyThread();
        thread1.setName("Thread #1");
        Thread thread2 = new MyThread();
        thread2.setName("Thread #2");

        // create runnable objects
        Runnable runnable1 = new MyRunnable();
        Runnable runnable2 = new MyRunnable();

        Thread thread3 = new Thread(runnable1);
        thread3.setName("Thread #3");
        Thread thread4 = new Thread(runnable2);
        thread4.setName("Thread #4");

        // start all threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
