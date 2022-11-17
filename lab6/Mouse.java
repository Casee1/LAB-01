package lab6;

public class Mouse extends Rodent {

    public Mouse(int sleepingHours, String dimension, String speed){
        super(sleepingHours, dimension, speed);
    }

    public int calculateFood(String place){
        int nrOfChees=50;
        return nrOfChees;
    }

    public int getTime(int area,String speed){
        int time;

        if(speed.equals("low")){
            time=area*6;
        }

        else if(speed.equals("fast")){
            time=area*2;
        }
        else{
            time=area*4;
        }
        return time;
    }

    public void testTime(Rodent rodent){

        Mouse mouse1=(Mouse)rodent;
        int time = mouse1.getTime(25,"fast");
        System.out.println("The mouse runs in " + 25+ " km in " +time + " minutes");
    }

}
