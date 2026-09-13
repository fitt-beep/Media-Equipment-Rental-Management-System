package mediaequipmentrental;


public class AudioEquipment extends Equipment{
    
    public AudioEquipment(String equipmentID, String name, double rentalRate, boolean availability) {
        super(equipmentID, name, rentalRate, availability);
    }

    @Override
    public double calculateRentalCost(int days) {
    return (getRentalRate() * days) + 10.00;
    }
}
