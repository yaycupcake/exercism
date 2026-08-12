public class CarsAssemble {

    private static final int CARS_PER_HOUR = 221;
    
    public double productionRatePerHour(int speed) {
        double modifier = 1;
        if (speed >= 5 && speed <= 8) {
            modifier = 0.9;
        } else if (speed == 9) {
            modifier = 0.8;
        } else if (speed == 10) {
            modifier = 0.77;
        }
        return CARS_PER_HOUR * speed * modifier;
    }

    public int workingItemsPerMinute(int speed) {
        double preciseItemsPerMinute = productionRatePerHour(speed) / 60;
        return (int) preciseItemsPerMinute;
    }
}
