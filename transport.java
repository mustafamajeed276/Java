interface Vehicle {

    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}
class Bicycle implements Vehicle{

    int speed;
    int gear;

    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }

    @Override
    public void speedUp(int increment){
        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    public void printStates(){
        System.out.println("speed: " + speed + "gear: " + gear);
    }
}


class Car implements Vehicle {

    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed + "gear: " + gear);
    }
}

class Truck implements Vehicle {

    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed + "gear: " + gear);
    }
}

class transport {
    public static void main(String args[]){
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);

        System.out.println("Bicycle present state : ");
        bicycle.printStates();

        Car car = new Car();
        car.changeGear(1);
        car.speedUp(4);
        car.applyBrakes(3);
        
        System.out.println("Car present state : ");
        car.printStates();

        Truck truck = new Truck();
        truck.changeGear(1);
        truck.speedUp(4);
        truck.applyBrakes(3);
        
        System.out.println("Truck present state : ");
        truck.printStates();
    }
}