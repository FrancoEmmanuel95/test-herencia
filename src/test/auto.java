package test;

public class auto extends vehiculo {

    private Integer qtyDoors;
    private String transmission;

    public auto() {
    }

    public auto(Integer wheels,String colour, String fuel,Integer topSpeed,Integer qtyDoors, String transmission){
        super(wheels, colour, fuel, topSpeed);
        this.qtyDoors = qtyDoors;
        this.transmission = transmission;
    }
    public Integer getQtyDoors() {
        return qtyDoors;
    }

    public void setQtyDoors(Integer qtyDoors) {
        this.qtyDoors = qtyDoors;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
    public String comoHaceElAuto(){
        return "tsututututu";
    }
}
