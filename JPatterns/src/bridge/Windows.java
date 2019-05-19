package bridge;

public class Windows implements Bridge {

    @Override
    public void startWiFi() {
        System.out.println("Starting WiFi module on Bridge.Windows machine.");
    }

    @Override
    public void startBrowser() {
        System.out.println("Starting browser on Bridge.Windows machine.");
    }
}
