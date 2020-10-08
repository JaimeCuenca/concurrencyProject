public class ThreadWithDrawCash extends Thread{

    @Override
    public void run() {
        System.out.println("Conexión online simulada de la lectura de saldo del cliente");
        int cash = FakeDB.cash;
        long tiempoSleep = (long) (Math.random()*10000);
        try {
            sleep(tiempoSleep);
            System.out.println("Su saldo actual es: " + FakeDB.cash);
            cash=cash-180;
            FakeDB.cash=cash;
            sleep(tiempoSleep);
            System.out.println("Su saldo actual después de retirar 180€ es: " + FakeDB.cash);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
