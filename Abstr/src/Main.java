public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Car maseraty = factory.create("Maseraty");
        Car tesla = factory.create("Tesla");
        Car lamborgini = factory.create("Lamborginy");
        Car toyota = factory.create("Toyota");
        maseraty.drive();
        tesla.drive();
        lamborgini.drive();
    }
}
interface Car {
    void drive();
}

class Maserati implements Car{
    @Override
    public void drive() {
        System.out.println("Driving Maserati");
    }
}

class Tesla implements Car{
    @Override
    public void drive() {
        System.out.println("Driving Tesla!!!");
    }
}

class Lamborginy implements Car{
    @Override
    public void drive() {
        System.out.println("Let's steal lambo?");
    }
}

class Factory{
    public Car create(String TypeOfCar){
        switch (TypeOfCar) {
            case "Maseraty" : return new Maserati();
            case "Tesla" : return new Tesla();
            case "Lamborginy" : return new Lamborginy();
            default : return null;
        }
    }
}