package Thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Retrieving the number of threads currently running //
        System.out.println("The number of threads currently running: " + Thread.activeCount());
        // Getting the name of the thread currently running //
        System.out.println("The name of the thread currently running: " + Thread.currentThread().getName());
        // Changing the name of the current thread in execution //
        Thread.currentThread().setName("Aditya");
        // Printing the name of the changed thread //
        System.out.println("The name of the thread after modification: " + Thread.currentThread().getName());

        // Now, we can check and change the priority of a thread //
        System.out.println("The current priority of the running thread: " + Thread.currentThread().getPriority());
        // Changing priority of the thread //
        // The range is from 1-10 with 1 being the lowest and 10 being the highest //
        Thread.currentThread().setPriority(7);
        System.out.println("The changed priority of the thread: " + Thread.currentThread().getPriority());
        // Furthermore, we can also check whether a code is alive or not //
        System.out.println(
                "The state of cuurent thread (Alive is represented by True):" + Thread.currentThread().isAlive());
        // We can now use and implement the sleep function by using a for loop and then
        // making the thread
        // sleep for 1 second [i.e 1000 miliseconds]. This way the number will be
        // printed after a time gap
        // of 1 second rather than instantaneously.

        for (int i = 5; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(3000); // We are making it sleep for 3 seconds //
        }
        System.out.println("You are done");
        System.out
                .println("-------------------------------------------------------------------------------------------");

        // Now, we are going to create another thread andexecute it's functions and
        // methods //

        class Mythread extends Thread {
            // Ovverride //
            public void run() {
                System.out.println("The secong thread is running");
            }
        }

        Mythread thread2 = new Mythread();
        System.out.println("The name of the second thread is:" + thread2.getName());
        thread2.setName("Batman");
        System.out.println("The name of the second thread after modification: " + thread2.getName());
        System.out.println("The priority of the second thread:" + thread2.getPriority());
        thread2.setPriority(7);
        System.out.println("The priority of the second thread after modification: " + thread2.getPriority());
        System.out.println("The current state of the second thread[true is the thread is alive]: " + thread2.isAlive());
        System.out.println("The number of threads currently running: " + Thread.activeCount());
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(3000);
        }

        System.out.println("YES! BOTH THE THREADS HAVE FINISHED!!!");
        System.out
                .println("------------------------------------------------------------------------------------------");
        // Daemon Thread Theory: Daemon threads are threads that run in the background
        // doing tasks like
        // Garbage collection and similar low priority tasks. Furthermore, the
        // compilation process doesn't wait for
        // the completetion of the daemon thread. If all the user threads are executed
        // then the process/program
        // exits successfully

        class Daemon_check extends Thread {
            public void run() {

            }
        }
        Daemon_check t3 = new Daemon_check();
        // We can modify and make a certain thread to be Daemon or User //
        t3.setDaemon(true);

        if (t3.isAlive()) {
            System.out.println("This is an Alive class");
        } else if (t3.isDaemon()) {
            System.out.println("This is a Daemon class running");
        }
        System.out.println("-------------------------------------------------------------------------");

    }
}