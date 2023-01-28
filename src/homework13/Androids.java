package homework13;

public class Androids implements Smartphones, LinuxOS{

    int opVersion = 0;

    public Androids(int opVersion) {
        this.opVersion = opVersion;
    }

    @Override
    public void getOpVersion() {
        System.out.println("Android OS version " + opVersion + " contain options for: ");
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
