public class Main {
    public static void main(String[] args) {
        ThreadWithDrawCash t1 = new ThreadWithDrawCash();
        t1.start();
        ThreadWithDrawCash t2 = new ThreadWithDrawCash();
        t2.start();
        ThreadWithDrawCash t3 = new ThreadWithDrawCash();
        t3.start();
    }
}
