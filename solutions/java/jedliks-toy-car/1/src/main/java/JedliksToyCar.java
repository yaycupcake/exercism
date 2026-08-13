public class JedliksToyCar {
    private int METERS = 0;
    private int PERCENTAGE = 100;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        String distanceDisplayMessage = "Driven " + METERS + " meters";
        return distanceDisplayMessage;
    }

    public String batteryDisplay() {
        String batteryDisplayMessage = "Battery empty";
        if (PERCENTAGE > 0) {
            batteryDisplayMessage = "Battery at " + PERCENTAGE +"%";
        }
        return batteryDisplayMessage;
    }

    public void drive() {
        batteryDisplay();
        if (PERCENTAGE > 0) {
            METERS += 20;
            PERCENTAGE -= 1;
        }
    }
}
