public class ThreadExample extends Thread{
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        ThreadExample t1 = new ThreadExample();
        t1.start();
    }
}
