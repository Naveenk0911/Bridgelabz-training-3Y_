package Constructors.level1;

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1000; // fixed cost per day

    CarRental() {
        customerName = "Unknown";
        carModel = "Standard";
        rentalDays = 1;
    }

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    void displayDetails() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental r1 = new CarRental();
        CarRental r2 = new CarRental("Alice", "Sedan", 5);

        r1.displayDetails();
        r2.displayDetails();
    }
}
