package test;

public class vehiculo {

    private Integer wheels;
    private String colour;
    private String fuel;
    private Integer topSpeed;

    public vehiculo() {
    }

    public vehiculo(Integer wheels, String colour, String fuel, Integer topSpeed) {
        this.wheels = wheels;
        this.colour = colour;
        this.fuel = fuel;
        this.topSpeed = topSpeed;
    }

    public String getColour() {
        return colour;
    }

    public Integer getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(Integer topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Integer getWheels() {
        return wheels;
    }

    public void setWheels(Integer wheels) {
        this.wheels = wheels;
    }

    public String RIP(){
        return "tacataca";
    }
}

