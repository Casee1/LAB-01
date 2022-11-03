import java.awt.Color;
/**
 *  Represents a car.
 *  The attributes are speed, engine power and color.
 *  The methods are accelerate,
 *  decelerate, getSpeed, getColor, getPower,
 *  getAcceleration, and getMaxSpeed.
 *
 * @author Laboratory Team
 */
public class Car
{
    private String brandAndModel; // this car brand and model name
    private int speed = 0;  // current car speed
    private Color color; // color of this car from java.awt.Color
    private int power; // power in BHP units
    private int accelerationStep=0; // speed increase when gas pedal pushed
    private int maxSpeed;           // maximum speed for this car
    /**
     * minimum speed for all cars; km/h
     */
    private int BreakingStep=30;
    private int gear=0;

    private FuelTank tank;

    private float FuelComs;

    public static final int MIN_SPEED = 0;
    /**
     * maximum speed on all cars; km/h
     */
    public static final int MAX_SPEED = 300;
    /**
     * minimum power for all cars; no less than 4 bhp
     */
    public static final int MIN_POWER = 4;
    /**
     * maximum power for all cars.no more than 500 bhp
     */
    public static final int MAX_POWER = 500;
    /**
     * minimum speed increase per step when gas pedal pushed
     */
    public static final int ACCELERATION_MIN_STEP = 1;
    /**
     * maximum speed increase per step when gas pedal pushed
     */
    public static final int ACCELERATION_MAX_STEP = 30; //
    // TODO integrate fuel tank
    /**
     * Constructor to create a new Car object
     * @param brandAndModel brand and model
     * @param color color of the Car object - one of Java color constants
     * @param power engine power
     * @param maxSpeed maximum speed which this car can reach
     * @param accelerationStep increase in speed when gas pedal pushed
     */
    public Car(String brandAndModel, Color color, int power, int maxSpeed, int accelerationStep,float fuel,float level)
    {
        //creates a new Car object with specified brand name, color, engine power, and maximum speed
        this.brandAndModel = brandAndModel;
        this.color = color;
        if (power > MIN_POWER)
            this.power = power;
        else
            this.power = MIN_POWER;
        if (power < MAX_POWER)
            this.power = power;
        else
            this.power = MAX_POWER;
        if (maxSpeed < 0) this.maxSpeed = MIN_SPEED; // this car wil never move
        else
        if (maxSpeed < MAX_SPEED) this.maxSpeed = maxSpeed;
        else maxSpeed = MAX_SPEED;
        if (power < MIN_POWER) this.power = MIN_POWER;
        else
        if (power > MAX_POWER) this.power=MAX_POWER;
        if (accelerationStep < ACCELERATION_MIN_STEP)
            this.accelerationStep = ACCELERATION_MIN_STEP;
        else
        if (accelerationStep > ACCELERATION_MAX_STEP)
            this.accelerationStep = ACCELERATION_MIN_STEP;
        else
            this.accelerationStep = accelerationStep;
        tank=new FuelTank(fuel,level);
    }
    public Car()
    {
        this("Dacia Duster", java.awt.Color.RED, 110, 180, 20,70.0f,50.0f);
    }
    /**
     * Simulates pressing the accelerator.
     * @return the new speed
     */
    public int accelerate()
    {
        int newSpeed = speed + accelerationStep;
        if(newSpeed <= maxSpeed)
        {
            speed = newSpeed;
        }
        else
        {
            speed = maxSpeed;
        }
        if(this.speed==0)
        {
            this.FuelComs=0.5f;
            this.gear=0;
        }
        else if(this.speed>0 && this.speed<=20)
        {
            this.FuelComs=5.0f;
            this.gear=1;
        }
        else if(this.speed>=20 && this.speed<=60)
        {
            this.FuelComs=6.0f;
            this.gear=2;
        }
        else if(this.speed>=60 && this.speed<=90)
        {
            this.FuelComs=7.0f;
            this.gear=3;
        }
        else
        {
            this.FuelComs=9.0f;
            this.gear=4;
        }
        return speed;
    }

    /**
     * Simulates releasing the accelerator.
     * @return the new speed
     */
    public int decelerate()
    {
        if(speed > MIN_SPEED)
        {
            speed -= accelerationStep;
        }
        if(this.speed==0)
        {
            this.FuelComs=0.5f;
            this.gear=0;
        }
        else if(this.speed>0 && this.speed<=20)
        {
            this.FuelComs=5.0f;
            this.gear=1;
        }
        else if(this.speed>=20 && this.speed<=60)
        {
            this.FuelComs=6.0f;
            this.gear=2;
        }
        else if(this.speed>=60 && this.speed<=90)
        {
            this.FuelComs=7.0f;
            this.gear=3;
        }
        else
        {
            this.FuelComs=9.0f;
            this.gear=4;
        }
        return speed;
    }

    /**
     * @return the current speed
     */
    public int getSpeed()
    {
        return speed;
    }

    /**
     * @return the max speed
     */
    public int getMaxSpeed()
    {
        return MAX_SPEED;
    }

    /**
     * @return the color of the car
     */
    public Color getColor()
    {
        return color;
    }

    /**
     * @return the brand name of the car
     */
    public String getBrandAndModel()
    {
        return brandAndModel;
    }

    /**
     * @return the car's acceleration step
     */
    public int getAcceleration()
    {
        return accelerationStep;
    }

    /**
     * @return the power of the car
     */
    public int getPower()
    {
        return power;
    }
    // TODO: add a toString method

    public int Break(){
        if (this.speed >= 30) {
            this.speed=this.speed-this.BreakingStep;
        }
        else{
            this.speed=0;
        }
        if(this.speed==0)
        {
            this.FuelComs=0.5f;
            this.gear=0;
        }
        else if(this.speed>0 && this.speed<=20)
        {
            this.FuelComs=5.0f;
            this.gear=1;
        }
        else if(this.speed>=20 && this.speed<=60)
        {
            this.FuelComs=6.0f;
            this.gear=2;
        }
        else if(this.speed>=60 && this.speed<=90)
        {
            this.FuelComs=7.0f;
            this.gear=3;
        }
        else
        {
            this.FuelComs=9.0f;
            this.gear=4;
        }

        return speed;
    }
    public int getGear(){
        return this.gear;
    }

    public FuelTank getTank() {
        return tank;
    }

    public float getFuelComs() {
        return FuelComs;
    }
}
