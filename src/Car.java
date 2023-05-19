public class Car extends Thread {
    private int stopTime;

    public Car(int stopTime, String name) {
        super(name);
        this.stopTime = stopTime;
    }
    public void run() {
        try {
            for (int i = 1; i <= 20; i++) {
                if (i == 10 || i == 15) {
                    Thread.sleep(stopTime);
                    System.out.println(getName() + " остановился на " + i + " км.");
                } else {
                    System.out.println(getName() + " проехал " + i + " км.");
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
