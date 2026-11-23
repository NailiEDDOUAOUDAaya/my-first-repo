
public class Vehicle implements Rentable {
    private String registrationNumber ;
    private String brand ;
    private String model ;
    private int year ;
    private double dailyRate ;
    private VehicleStatus status ;
    private FuelType fuelType;
    public Vehicle (String rN , String b , String m ,
        int y , double dR , VehicleStatus s , FuelType fT 
     ){
        this.registrationNumber=rN;
        this.brand=b;
        this.model=m;
        this.year=y;
        this.dailyRate=dR;
        this.status=s;
        this.fuelType=fT;
     }
    public double getDailyRate (){
        return dailyRate ;
     }
    public VehicleStatus getStatus(){
        return status;
    }
    @Override 
    public boolean isAvailable() {
        if ( status == VehicleStatus.AVAILABLE ){ return true ;
    }else { return false;}
}
    @Override
    public void rent(){
        if ( isAvailable()){
           status = VehicleStatus.RENTED ;
            System.out.println("vechle :" + brand + model + "Rentable.");
        } else { System.out.println("vechle :" + brand + model + "not available.");}
    }
    @Override 
    public void returnVehicle(){
        if ( status == VehicleStatus.RENTED ){
            status = VehicleStatus.AVAILABLE ;
             System.out.println("vechle :" + brand + model + "its available.");
    } else {System.out.println("vechle :" + brand + model + "wasnt Rented.");}
}
    @Override 
    public double calculateRentalCost(int days) {
        return ( days * 15 );
    }
    public void displayInfo(){
        System.out.println("veicle n° :" + registrationNumber + " brand : " + brand + " model : " + model + " year : " + year );
        System.out.println("rate : " + dailyRate ); 
        System.out.println("statu : " + status + " fuel type : " + fuelType);
    }
    


}