package mediaequipmentrental;


public class Camera extends Equipment{
    
    public Camera(String equipmentID, String name, double rentalRate, boolean availability) {
    super(equipmentID, name, rentalRate, availability);
    }
    
     @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
    
}
