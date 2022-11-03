public class Main {
    public static void main(String[] args) {
        Car car1=new Car("FIAT",java.awt.Color.BLUE, 150,200,20,50.0f,0.4f);
        System.out.println(car1.getTank().getCapacity() +" "+ car1.getGear());
        System.out.println(car1.getFuelComs() +" "+ car1.getGear());
        car1.accelerate();
        car1.accelerate();
        System.out.println(car1.getFuelComs()+ " "+ car1.getGear());
        car1.accelerate();
        car1.Break();
        System.out.println(car1.getFuelComs() + " " + car1.getGear());
    }
}