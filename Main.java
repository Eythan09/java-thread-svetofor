public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Программа началась");

        // два светофора = два потока
        Thread t1 = new Thread(new TrafficLightTask("Светофор 1", 2));
        Thread t2 = new Thread(new TrafficLightTask("Светофор 2", 2));

        t1.start();   // запускаем потоки (вызывается run())
        t2.start();

        t1.join();    // ждём, пока оба закончат
        t2.join();

        System.out.println("Все потоки завершены");
    }
}
