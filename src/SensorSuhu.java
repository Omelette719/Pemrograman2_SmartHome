public class SensorSuhu {
    private final double suhuRuangan;

    public SensorSuhu(double suhuRuangan) {
        this.suhuRuangan = suhuRuangan;
    }

    public double bacaSuhu() {
        return suhuRuangan;
    }
}
