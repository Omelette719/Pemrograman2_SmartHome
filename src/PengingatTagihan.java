public class PengingatTagihan implements DapatDijadwalkan {
    private final String namaTagihan;
    private String jadwal = "belum diatur";

    public PengingatTagihan(String namaTagihan) {
        this.namaTagihan = namaTagihan;
    }

    @Override
    public void aturJadwal(String waktu) {
        jadwal = waktu;
    }

    @Override
    public String getJadwal() {
        return "Bayar " + namaTagihan + " pada " + jadwal;
    }
}
