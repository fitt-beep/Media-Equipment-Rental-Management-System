package mediaequipmentrental;

public class MediaEquipmentRental {

    
    public static void main(String[] args) {
        
        System.out.println("STEP 1: Main started");
        DBConnection.connect();
        System.out.println("STEP 2: Connection method finished");
        new EquipmentForm().setVisible(true);
        System.out.println("STEP 3: GUI opened");
    }
    
}
