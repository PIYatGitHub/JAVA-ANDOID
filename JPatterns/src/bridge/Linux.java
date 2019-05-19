package bridge;

public class Linux implements Bridge {

    @Override
    public void startWiFi() {
        System.out.println("Starting WiFi module on Bridge.Linux machine.");
    }

    @Override
    public void startBrowser() {
        System.out.println("Starting browser on Bridge.Linux machine.");
    }
}
