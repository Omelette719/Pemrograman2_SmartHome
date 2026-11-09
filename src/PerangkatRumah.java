public abstract class PerangkatRumah {
    private final String nama;
    private final MeteranDaya meteran = new MeteranDaya(); // komposisi
    private boolean menyala = false;

    protected PerangkatRumah(String nama) {
        this.nama = nama;
    }

    // Metode konkret yang diwarisi semua kelas turunan
    public void nyalakan() {
        menyala = true;
        System.out.println(nama + " dinyalakan.");
    }

    public void matikan() {
        menyala = false;
        System.out.println(nama + " dimatikan.");
    }

    public boolean isMenyala() {
        return menyala;
    }

    public String getNama() {
        return nama;
    }

    public void gunakanSelama(double jam) {
        if (menyala) {
            meteran.catat(hitungDayaWatt(), jam);
        }
    }

    public double getPemakaianKwh() {
        return meteran.getTotalKwh();
    }

    // Metode abstrak yang menjadi isi kontrak
    public abstract int hitungDayaWatt();

    public abstract void jalankanFungsiUtama();
}
