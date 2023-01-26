package homework14;

public class FitnessTracker {
    private String name;
    private int date;
    private int month;
    private int year;
    private String email;
    private int phoneNumber;

    String surname;
    double weight;
    double pressure;
    int steps;

    public FitnessTracker(String name, int date, int month, int year, String email, int phoneNumber, String surname, double weight, double pressure, int steps) {
        this.name = name;
        this.date = date;
        this.month = month;
        this.year = year;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
    }

        int age = 0;
    void printAccountInfo(){
        age = 2023 - year;
        System.out.println();
        System.out.println("Name: " + name + "\n" + "Age: " + age + "\n" + "Date: " + date + "\n" + "Month: " + month + "\n" + "Year: " + year + "\n" + "Email: " + email + "\n" + "Phone number: " + phoneNumber + "\n" + "Surname: " + surname + "\n" + "Weight: " + weight + "\n" + "Pressure: " + pressure +
                "\n" + "Daily steps amount: " + steps);
    }

    public int getAge() {
        return age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getDate() {

        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

}
