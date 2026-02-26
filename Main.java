public class Main {
    public static void main(String[] args) {
       
        Doctor doc = new Doctor("Dr. John", 101, "Cardiology", "Heart Surgeon");
        Nurse nrs = new Nurse("Nurse Peter", 202, "Pediatrics");
        Administrator admin = new Administrator(" Wish Paul", 501);

        System.out.println(" HOSPITAL MANAGEMENT SYSTEM ");

    
        doc.displayRole();
        doc.provideTreatment();

        System.out.println("----------------------------------");

        nrs.displayRole();
        nrs.provideTreatment();

        System.out.println("----------------------------------");

    
        admin.displayRole();
        admin.generateReport();
        
        System.out.println("==================================");
    }
}
