package mediaequipmentrental;

public abstract class Equipment {

    private String equipmentID;
    private String name;
    private double rentalRate;
    private boolean availability;
    
    public Equipment(String equipmentID, String name, double rentalRate, boolean availability) {
    this.equipmentID = equipmentID;
    this.name = name;
    this.rentalRate = rentalRate;
    this.availability = availability;
    }
    
    public String getEquipmentID() {
    return equipmentID;
    }
    
    public String getName() {
    return name;
    }
    
    public double getRentalRate() {
    return rentalRate;
    }
    
    public boolean isAvailable() {
    return availability;
    }
    
    public void setName(String name) {
    this.name = name;
    }
    
    public void setRentalRate(double rentalRate) {
    this.rentalRate = rentalRate;
    }
    
    public void setAvailability(boolean availability) {
    this.availability = availability;
    }
    
    public abstract double calculateRentalCost(int days);

}

/*
 * Created the Equipment abstract class.
 * Added attributes for equipment ID, name, rental rate, and availability.
 * Added a constructor to initialize the equipment details.
 * Added getter methods to retrieve the equipment information.
 * Added setter methods to update the equipment information.
 */