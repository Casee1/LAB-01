package lab6;

public class Squirel extends Rodent {

    public Squirel(int sleepingHours,String dimension,String speed){
        super(sleepingHours,dimension,speed);
    }
    @Override
    public int calculateFood(String place) {
        int nrOfAcorn=0;

        if(place.equals("forest")){
            nrOfAcorn=nrOfAcorn+200;
        }
        else if(place.equals("field"))
        {
            nrOfAcorn=nrOfAcorn+15;
        }
        else {
            nrOfAcorn = nrOfAcorn + 10;
        }
        return nrOfAcorn;
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

        Squirel squirel1=(Squirel)rodent;
        int time = squirel1.getTime(30,"fast");
        System.out.println("The squirel runs in " + 30+ " km in " +time + " minutes");
    }
}
