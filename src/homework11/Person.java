package homework11;

public class Person {
    public static void main(String[] args) {
        System.out.println();

        String result1 = personInfo("Will", "Smith", "New York", 4353453);
        System.out.println(result1);

        String result2 = personInfo("Jackie", "Chan", "Shanghai", 4353453);
        System.out.println(result2);

        String result3 = personInfo("Sherlock", "Holmes", "London", 4353453);
        System.out.println(result3);

    }

    static String personInfo(String name, String surname, String city, int phoneNumber) {
        return  "Зателефонувати громадянину " + name + " " + surname + " з міста" + " " + city + " можна за номером " + phoneNumber + ".";
    }
}
