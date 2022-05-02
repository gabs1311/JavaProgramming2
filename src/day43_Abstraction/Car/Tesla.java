package day43_Abstraction.Car;

public final class Tesla extends Car {
    public Tesla( String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Start by voice command");
    }

    @Override
    public void stop() {
        super.stop();
    }

    public void voiceCommand(){
        System.out.println(getBrand()+ ""+getModel()+ " has voice command features");
    }
}
