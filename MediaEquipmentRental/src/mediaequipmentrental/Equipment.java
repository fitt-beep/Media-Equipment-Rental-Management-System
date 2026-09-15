package mediaequipmentrental;

public abstract class Equipment {

    private String equipmentID;
    private String name;
    private double rentalRate;

    public Equipment(String equipmentID, String name, double rentalRate) {
        this.equipmentID = equipmentID;
        this.name = name;
        this.rentalRate = rentalRate;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);
}