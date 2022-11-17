package lab6;

public class Main {
    public static void main(String[] args){
        Capybara capybara1 =new Capybara(6,"huge","slow speed");
        int nrOfFood=capybara1.calculateFood("forest");
        System.out.println("The capybara ate " + nrOfFood + " leafs");


        Capybara capybara2 =new Capybara(5,"huge","slow speed");
        int nrOfFood2=capybara1.calculateFood("swamp");
        System.out.println("The capybara ate " + nrOfFood2 + " leafs");

        Squirel squirel1=new Squirel(7,"medium","fast");
        int nrOfFood3=squirel1.calculateFood("field");
        System.out.println("The Sqiurel ate " + nrOfFood3 + " leafs");

        Squirel squirel2=new Squirel(10,"medium","fast");
        int nrOfFood4=squirel1.calculateFood("forest");
        System.out.println("The Sqiurel ate " + nrOfFood4 + " leafs");

        Rodent[] rodents = {capybara1,capybara2,squirel1,squirel2};

        for(int i=0;i<rodents.length;i++)
        {
            int nrOfFood5=rodents[i].calculateFood("forest");
            System.out.println("Rodent nr " + (i+1) + "ate " + nrOfFood5);
        }

        Rodent rodent1=new Mouse(2,"small","fast");
        rodent1.testTime(rodent1);

        Rodent rodent2=new Capybara(8,"huge","slow");
        rodent2.testTime(rodent2);
    }
}
