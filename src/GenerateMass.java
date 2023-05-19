import java.util.ArrayList;

public class GenerateMass extends Thread{
    public GenerateMass(String name) {
        super(name);
    }
    @Override
    public void run() {
        try {
            sleep(15000);
            int[] random = new int[10];
            for(int i=0;i<random.length;i++){
                random[i]= (int) (Math.random()*100);
            }
            int temp=0;
            for(int i=0;i<random.length;i++){
                if(temp<random[i]){
                    temp=random[i];
                }
            }
            System.out.println(getName()+" максимальное значение: "+temp);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
