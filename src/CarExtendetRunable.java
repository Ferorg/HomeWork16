public class CarExtendetRunable implements Runnable  {

int stopTime;

    public CarExtendetRunable(int stopTime) {
        this.stopTime = stopTime;
    }

    public void run() {
        try {

            for (int i = 1; i <= 20; i++) {
                if(i==10||i==15){
                    System.out.println(Thread.currentThread().getName()+" остановился на"+i+" км.");
                    Thread.currentThread().sleep(1500);
                }else{
                    System.out.println(Thread.currentThread().getName() + " проехал " + i + " км.");
                }

            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }
}


