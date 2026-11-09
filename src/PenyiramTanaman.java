public class PenyiramTanaman extends PerangkatRumah implements DapatDijadwalkan {
    private String jadwal = "belum diatur";

    public PenyiramTanaman() {
        super("Penyiram Tanaman");
    }

    @Override
    public int hitungDayaWatt() {
        return 60;
    }

    @Override
    public void jalankanFungsiUtama() {
        System.out.println(getNama() + " menyiram kebun.");
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
