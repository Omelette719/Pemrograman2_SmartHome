public class PendinginRuangan extends PerangkatRumah implements DapatDijadwalkan {
    private final SensorSuhu sensor = new SensorSuhu(31.0); // komposisi
    private String jadwal = "belum diatur";

    public PendinginRuangan() {
        super("Pendingin Ruangan");
    }

    @Override
    public int hitungDayaWatt() {
        return sensor.bacaSuhu() > 28 ? 900 : 450;
    }

    @Override
    public void jalankanFungsiUtama() {
        System.out.println(getNama() + " mendinginkan ruangan bersuhu " + sensor.bacaSuhu() + " derajat Celsius.");
    }

    @Override
    public void aturJadwal(String waktu) {
        jadwal = waktu;
    }

    @Override
    public String getJadwal() {
        return jadwal;
    }
}
