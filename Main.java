public class Main {

    public static void main (String [] args){

        Main race = new Main();

    }
    public void launch(String name){
        RaceCar rc = new RaceCar(name);
        Thread rcThread = new Thread(rc);
        rcThread.start();
    }

    public Main(){
        launch("Car 1");
        launch("Car 2");
        launch("Car 3");
        launch("Car 4");
        launch("Car 5");
        launch("Car 6");
        launch("Car 7");
        launch("Car 8");

        while (true){
            synchronized (RaceCar.class){
                if (RaceCar.place.size() == 8){
                    break;
                }
            }
        }
        System.out.println(RaceCar.place);
    }

}
