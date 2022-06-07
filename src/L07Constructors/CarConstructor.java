package L07Constructors;

import javax.xml.namespace.QName;

public class CarConstructor {

    String name = "N/A";
    String color = "N/A";
    int release_year = -1;
    int horse_power = -1;
    boolean second_hand=false;

    public CarConstructor(String name, String color, int release_year, int horse_power, boolean second_hand) {
        this.name = name;
        this.color = color;
        this.release_year = release_year;
        this.horse_power = horse_power;
        this.second_hand = second_hand;
    }

    public CarConstructor(String brand,String colour, boolean used){
        this.second_hand = used;
        this.name=brand;
        this.color=colour;
    }

    public CarConstructor(String name,String color, int release_year, int horse_power){
        this.name=name;
        this.color=color;
        this.release_year=release_year;
        this.horse_power=horse_power;

    }

    public CarConstructor(String name, int release_year, int horse_power, boolean second_hand){
        this.name=name;
        this.release_year=release_year;
        this.horse_power=horse_power;
        this.second_hand=second_hand;
    }

    public CarConstructor(){}

    @Override
    public String toString() {
        return "CarConstructor{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", release_year=" + release_year +
                ", horse_power=" + horse_power +
                ", second_hand=" + second_hand +
                '}';
    }

    public static void main(String[] args) {

        CarConstructor Opel = new CarConstructor("Vectra","Green",1999,115,true);
        CarConstructor Ford = new CarConstructor("Fiesta","Blue",false);
        CarConstructor Peugeot = new CarConstructor("506","Black",2013,150);
        CarConstructor Mercedes = new CarConstructor("C220",2005,160,true);
        CarConstructor BMW = new CarConstructor();

        System.out.println(Opel);
        System.out.println(Ford);
        System.out.println(Peugeot);
        System.out.println(Mercedes);
        System.out.println(BMW);


    }
}
