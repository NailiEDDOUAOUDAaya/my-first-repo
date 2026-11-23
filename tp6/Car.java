public class Car extends Vehicle implements Insurable {
   private int numberOfDoors;
   private boolean airConditioning ;
   public Car ( String rN , String b , String m ,
        int y , double dR , VehicleStatus s , 
        FuelType fT , int nOD , boolean aC ){
            super(rN, b, m, y, dR, s, fT) ;
            this.numberOfDoors = nOD;
            this.airConditioning = aC;
 }
   public int getNumberOfDoors (){ return numberOfDoors;}
   public boolean hasAirConditioning () {return airConditioning;}
   @Override 
   public double calculateRentalCost (int days){
    double i = super.calculateRentalCost(days) ;
       if ( hasAirConditioning()){ i += 10 + numberOfDoors ;} 
        else {i += numberOfDoors ;}
        return i;
 }
    @Override 
   public double calculateInsurance(){
    int i;
    if ( hasAirConditioning()){
      i = (10 + numberOfDoors )*2;
    }else {i = numberOfDoors *2 ;}
    return i;
 }
   @Override 
    public void displayInfo(){
    super.displayInfo();
     System.out.println("numer of doors : " + numberOfDoors );
    if ( hasAirConditioning()){ 
     System.out.println("has air conditioing");}
    else { System.out.println(" has no air conditioing");}
    
}
}