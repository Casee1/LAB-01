package lab6;

public abstract class Rodent {
    private int sleepingHours;
    private String dimension;
    private String speed;


    public Rodent (int sleepingHours,String dimention,String speed){
        this.sleepingHours=sleepingHours;
        this.dimension=dimension;
        this.speed=speed;
    }
    public abstract int calculateFood (String place);
    public abstract void testTime(Rodent rodent);

}
