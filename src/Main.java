
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(1500, "BMV");
        Car car2 = new Car(2500, "Ferrari");
        CarExtendetRunable car3 = new CarExtendetRunable(5000);
        Thread car3Thread = new Thread(car3, "Golf");
        goCar(car1, car2, car3Thread);

        //___________________________________________________-
        GenerateMass gm1 = new GenerateMass("1 поток");
        GenerateMass gm2 = new GenerateMass("2 поток");
        GenerateMass gm3 = new GenerateMass("3 поток");
        GenerateMass gm4 = new GenerateMass("4 поток");
        GenerateMass gm5 = new GenerateMass("5 поток");
        GenerateMass gm6 = new GenerateMass("6 поток");
        GenerateMass gm7 = new GenerateMass("7 поток");
        GenerateMass gm8 = new GenerateMass("8 поток");
        GenerateMass gm9 = new GenerateMass("9 поток");
        GenerateMass gm10 = new GenerateMass("10 поток");
        gm1.start();
        gm2.start();
        gm3.start();
        gm4.start();
        gm5.start();
        gm6.start();
        gm7.start();
        gm8.start();
        gm9.start();
        gm10.start();

    }

    public static void goCar(Car car1, Car car2, Thread car3Thread) {

        try {
            car1.start();
            car1.join();
            car2.start();
            car3Thread.start();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}