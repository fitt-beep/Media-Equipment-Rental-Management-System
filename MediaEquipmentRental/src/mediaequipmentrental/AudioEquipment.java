package mediaequipmentrental;

public class AudioEquipment extends Equipment {

    public AudioEquipment(String equipmentID, String name, double rentalRate) {
        super(equipmentID, name, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return (getRentalRate() * days) + 10.00;
    }
}