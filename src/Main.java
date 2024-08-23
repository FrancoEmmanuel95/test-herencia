
import test.moto;
import test.auto;

public class Main {
    public static void main(String[] args) {

        moto m1 = new moto(2,"rojo","nafta",130,110,"cadenero");
        auto a1 = new auto(4,"azul","nafta",100,2,"manual");

        System.out.printf(m1.comoHaceLaMoto()+"\n");
        System.out.printf(a1.comoHaceElAuto()+"\n");
        System.out.printf(m1.RIP()+"\n");
        System.out.printf(a1.RIP()+"\n");

        }
    }
