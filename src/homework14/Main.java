package homework14;

public class Main {
    public static void main(String[] args) {


        FitnessTracker person1 = new FitnessTracker("Silvia", 6, 06, 1969, "test@google.com", 000000, "White",
                69.7, 120.40, 1900);

        FitnessTracker person2 = new FitnessTracker("Jason", 4, 07, 1980, "test@google.com", 0000000, "Woobliy",
                70, 105.00, 15000);

        FitnessTracker person3 = new FitnessTracker("Jack", 16, 04, 1999, "test@google.com", 1234567, "Smith",
                74.5, 110.40, 10000);

        person1.setDate(16);
        person1.setMonth(10);
        person2.setYear(1988);
        person1.setEmail("test@google.com");
        person1.setPhoneNumber(24623746);
        person2.setWeight(64.9);
        person1.setPressure(140.04);
        person2.setSteps(21000);

        person1.printAccountInfo();
        person2.printAccountInfo();
        person3.printAccountInfo();

    }
}
