package test;

public class moto extends vehiculo {

    private Integer cc;
    private String motor;

    public moto(Integer cc, String motor) {
        this.cc = cc;
        this.motor = motor;
    }

    public moto(Integer wheels, String colour, String fuel, Integer topSpeed, Integer cc, String motor) {
        super(wheels, colour, fuel, topSpeed);
        this.cc = cc;
        this.motor = motor;
    }

    public String comoHaceLaMoto(){
        return "RAM PAM PAM";
    }


    public Integer getCc() {
        return cc;
    }

    public void setCc(Integer cc) {
        this.cc = cc;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
}
