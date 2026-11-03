// Задача для потока: светофор по кругу меняет сигналы
public class TrafficLightTask implements Runnable {
    private String name;   // имя светофора
    private int cycles;    // сколько раз повторить цикл

    public TrafficLightTask(String name, int cycles) {
        this.name = name;
        this.cycles = cycles;
    }

    @Override
    public void run() {
        for (int i = 1; i <= cycles; i++) {
            System.out.println(name + ": цикл " + i);

            System.out.println(name + ": КРАСНЫЙ");
            pause();
            System.out.println(name + ": ЖЁЛТЫЙ");
            pause();
            System.out.println(name + ": ЗЕЛЁНЫЙ");
            pause();
        }
        System.out.println(name + ": завершил работу");
    }

    // пауза 1 секунда
    private void pause() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(name + ": прервали");
        }
    }
}
