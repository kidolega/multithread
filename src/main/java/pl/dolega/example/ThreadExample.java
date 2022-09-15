package pl.dolega.example;

public class ThreadExample {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i < 1001; i++) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i < 1001; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        });

        t1.setPriority(1);
        t2.setPriority(10);

//        t1.setName("t1");
//        t2.setName("t2");

        t1.start();
        t2.start();
//        t1.run();
//        t2.run();

    }
}
