package mediaequipmentrental;

public class TestEquipment {
    
    public static void main(String[] args) {

        Equipment camera = new Camera(
                "C001",
                "Canon EOS R6",
                80.00
        );

        Equipment audio = new AudioEquipment(
                "A001",
                "Wireless Microphone",
                40.00
        );

        System.out.println("Camera: " + camera.getName());
        System.out.println("Rental cost for 3 days: RM "
                + camera.calculateRentalCost(3));

        System.out.println();

        System.out.println("Audio Equipment: " + audio.getName());
        System.out.println("Rental cost for 3 days: RM "
                + audio.calculateRentalCost(3));
    }
}