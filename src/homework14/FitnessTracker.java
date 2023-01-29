package homework14;

public class FitnessTracker {
    final String name;
    final int date;
    final int month;
    final int year;
    final String email;
    final int phoneNumber;

    String surname;
    double weight;
    double pressure;
    int steps;

    int age = 0;

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
        this.age = 2023 - year;
    }

    void printAccountInfo(){
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


    public int getDate() {

        return date;
    }


    public int getMonth() {
        return month;
    }


    public int getYear() {
        return year;
    }


    public String getEmail() {
        return email;
    }


    public int getPhoneNumber() {
        return phoneNumber;
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