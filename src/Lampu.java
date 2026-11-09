public class Lampu extends PerangkatRumah implements DapatDijadwalkan, DapatDiredupkan {
    private static final int DAYA_MAKSIMUM = 12;
    private int kecerahan = 100;
    private String jadwal = "belum diatur";

    public Lampu() {
        super("Lampu Ruang Tamu");
    }

    @Override
    public int hitungDayaWatt() {
        return DAYA_MAKSIMUM * kecerahan / 100;
    }

    @Override
    public void jalankanFungsiUtama() {
        System.out.println(getNama() + " menerangi ruangan pada kecerahan " + kecerahan + " persen.");
    }

    @Override
    public void aturKecerahan(int persen) {
        kecerahan = Math.max(0, Math.min(100, persen));
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
