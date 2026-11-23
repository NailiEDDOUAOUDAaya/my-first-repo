import java.util.ArrayList;
public class exo { public static void main(String[] args) {
Car car1 = new Car(
    "A12345", "Toyota", "Corolla",
    2022, 5000, VehicleStatus.AVAILABLE,
    FuelType.GASOLINE, 4, true
);

Car car2 = new Car(
    "B67890", "Renault", "Clio",
    2021, 3500, VehicleStatus.AVAILABLE,
    FuelType.DIESEL, 5, false
);

Car car3 = new Car(
    "C11223", "Tesla", "Model 3",
    2024, 8000, VehicleStatus.AVAILABLE,
    FuelType.ELECTRIC, 4, true
);
car1.displayInfo();
car1.rent();
System.out.println(car1.isAvailable());
System.out.println(car1.calculateRentalCost(5));
car1.returnVehicle();
System.out.println(car1.isAvailable());
System.out.println(car1.calculateInsurance());
car2.displayInfo();
System.out.println(car2.calculateRentalCost(5));
System.out.println(car2.calculateInsurance());
car3.displayInfo();
System.out.println(car3.calculateRentalCost(5));
System.out.println(car3.calculateInsurance());
ArrayList<Vehicle> vehicles = new ArrayList<>();
vehicles.add(car1);
vehicles.add(car2);
vehicles.add(car3); 
for (Vehicle v : vehicles) {
    System.out.println(v.calculateRentalCost(9));
} 
for (Vehicle v : vehicles) {
    if (v instanceof Car) {
        Car c = (Car) v;
        System.out.println(c.getNumberOfDoors());
        System.out.println(c.hasAirConditioning());
    }
}

}
}