package day43_Abstraction.Car;

public class CarShop {
    public static void main(String[] args) {

   //    Car car1 = new Car("Audi", "A6")

 // I cannot create object from the Abstract class, because the abstract class is not concrete

Honda honda  = new Honda("Accord","yellow",2015,25000);
Audi audi = new Audi("A6", "grey",2019,65000);
Tesla tesla= new Tesla("model 13", "blue",2020,75000);


        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);


        honda.start();
        honda.stop();
        audi.start();
        audi.autoPark();
        tesla.voiceCommand();
        tesla.start();
        tesla.stop();

audi.setColor("white");
honda.setPrice(37500);
            System.out.println(honda);
            System.out.println(audi);
            System.out.println(tesla);

    }
}
