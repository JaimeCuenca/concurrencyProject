public class Main { //hacerlo sin los join
    public static void main(String[] args) {
        try {
            ThreadWithDrawCash t1 = new ThreadWithDrawCash();
            t1.start();
            t1.join();
            ThreadWithDrawCash t2 = new ThreadWithDrawCash();
            t2.start();
            t2.join();
            ThreadWithDrawCash t3 = new ThreadWithDrawCash();
            t3.start();
            t3.join();
        }catch (InterruptedException e){
            e.getMessage();
        }
    }
}
