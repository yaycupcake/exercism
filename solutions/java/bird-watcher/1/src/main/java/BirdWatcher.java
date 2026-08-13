
class BirdWatcher {
    private final int[] birdsPerDay;
    private static int[] birdsLastWeek = new int[] {0, 2, 5, 3, 7, 8, 4};
    
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return birdsLastWeek;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1]++;
    }

    public boolean hasDayWithoutBirds() {
        boolean dayWithoutBirdsExists = false;
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] == 0) {
                dayWithoutBirdsExists = true;
                break;
            }
        }
        return dayWithoutBirdsExists;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int counter = 0;
        int maxDays = numberOfDays > birdsPerDay.length ? birdsPerDay.length : numberOfDays;
        for (int i = 0; i < maxDays; i++) {
            counter += birdsPerDay[i];
        }
        return counter;
    }

    public int getBusyDays() {
        int counter = 0;
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] >= 5) {
                counter ++;
            }
        }
        return counter;
    }
}
