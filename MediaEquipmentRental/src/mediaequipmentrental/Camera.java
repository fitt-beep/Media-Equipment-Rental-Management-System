package mediaequipmentrental;

public class Camera extends Equipment {

    public Camera(String equipmentID, String name, double rentalRate) {
        super(equipmentID, name, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
}