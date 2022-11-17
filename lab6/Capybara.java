package lab6;

public class Capybara extends Rodent {

    public Capybara (int sleepingHours, String dimension,String speed){
        super(sleepingHours,dimension,speed);
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

    public int calculateFood(String place) {
        int nrOfLeafs = 0;

        if (place.equals("forest")) {
            nrOfLeafs = nrOfLeafs + 100;
        } else if (place.equals("swamp")) {
            nrOfLeafs = nrOfLeafs + 20;
        } else {
            nrOfLeafs = nrOfLeafs + 55;
        }
        return nrOfLeafs;
    }

    public void testTime(Rodent rodent){

        Capybara capybara1=(Capybara)rodent;
        int time = capybara1.getTime(10,"slow");
        System.out.println("The capybara runs in " + 10+ " km in " +time + " minutes");
    }

}
