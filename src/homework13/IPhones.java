package homework13;

public class IPhones implements Smartphones, IOS{

    double opVersion = 0;

    public IPhones(double opVersion) {
        this.opVersion = opVersion;
    }

    @Override
    public void getAOpVersion() {
        System.out.println("Iphone OS version " + opVersion + " contain options for:");
    }

    @Override
    public void call() {
        System.out.println("Calls");

    }

    @Override
    public void sms() {
        System.out.println("SMS");

    }

    @Override
    public void internet() {
        System.out.println("Internet");
    }
}
