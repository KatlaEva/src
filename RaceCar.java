import java.util.ArrayList;
import java.util.Random;

public class RaceCar implements Runnable{

    private String name = "";
    private int distance = 0;
    private Random random = new Random();
    static ArrayList<RaceCar> place = new ArrayList<>();

    public RaceCar(String name){
        this.name = name;
    }


    @Override
    public void run() {

        while(distance < 1500){
            distance += 100;

            try{
                Thread.sleep(random.nextInt(500));
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }if (distance == 1500){
            synchronized (RaceCar.class){
                System.out.print(this.name);
                place.add(this);
                System.out.println(" is past the finish line");
            }
        }

    }

    @Override
    public String toString() {
        return this.name;
    }
}





















