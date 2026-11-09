public class MeteranDaya {
    private double totalWattJam = 0;

    public void catat(int watt, double jam) {
        totalWattJam += watt * jam;
    }

    public double getTotalKwh() {
        return totalWattJam / 1000;
    }
}
