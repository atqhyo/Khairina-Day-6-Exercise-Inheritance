//Super Class
class Vehicle {
    private String make;
    private String model;
    private int year;
    private double rentalPricePerDay;
    
    public Vehicle(String make, String model, int year, double rentalPricePerDay){
        this.make = make;
        this.model = model;
        this.year = year;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public double getRentalPricePerDay(){
        return rentalPricePerDay;
    }

    public double calculateRentalCost(int days){
        return rentalPricePerDay * days;
    }
}

//Sub Class #1
class Car extends Vehicle {
    private int numSeats;
    private int numDoors;

    public Car(String make, String model, int year, double rentalPricePerDay, int numSeats, int numDoors){
        super(make, model, year, rentalPricePerDay);
        this.numSeats = numSeats;
        this.numDoors = numDoors;
    }

    public void setCar(int numSeats, int numDoors){
        this.numSeats = numSeats;
        this.numDoors = numDoors;
    }

    public int getNumSeats(){
        return numSeats;
    }
    public int getNumDoors(){
        return numDoors;
    }

    @Override
    public String toString(){
        return "------ Car -------" + "\nMake: " + getMake() + "\nModel: " + getModel() + "\nYear: " + getYear()
                + "\nSeats: " + numSeats + "\nDoors: " + numDoors + "\nRental Price/Day: RM" + getRentalPricePerDay();
    }
}

class Motorcycle extends Vehicle {
    private int engineSize;

    public Motorcycle(String make, String model, int year, double rentalPricePerDay, int engineSize) {
        super(make, model, year, rentalPricePerDay);
        this.engineSize = engineSize;
    }

    public int getEngineSize(){
        return engineSize;
    }

    @Override
    public String toString(){
        return "\n------ Motorcycle -------" + "\nMake: " + getMake() + "\nModel: " + getModel() + "\nYear: " + getYear()
                + "\nEngine Size: " + engineSize + "\nRental Price/Day: RM" + getRentalPricePerDay();
    }
}

//Main Application
public class VehicleApp {
    public static void main(String[] args) {
        Car car = new Car("Perodua", "Myvi", 2024, 83.00, 5, 4);
        Motorcycle motorcycle = new Motorcycle("Yamaha", "MT-07", 2021, 30.00, 689);

        int rentalDays = 3;
        double carRentalCost = car.calculateRentalCost(rentalDays);
        double motorRentalCost = motorcycle.calculateRentalCost(rentalDays);

        System.out.println(car.toString());
        System.out.println("Rental cost for " + rentalDays + " days: RM" + carRentalCost);

        System.out.println(motorcycle.toString());
        System.out.println("Rental cost for " + rentalDays + " days: RM" + motorRentalCost);
    }
}

