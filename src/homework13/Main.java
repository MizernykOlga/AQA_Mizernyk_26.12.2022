package homework13;

public class Main {
    public static void main(String[] args) {

        Androids android = new Androids(13);
        IPhones iphone = new IPhones(16.3);

        System.out.println();
        android.getOpVersion();
        android.call();
        android.sms();
        android.internet();
        System.out.println();
        iphone.getAOpVersion();
        iphone.call();
        iphone.sms();
        iphone.internet();
    }
}
