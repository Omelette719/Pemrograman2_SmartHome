public class KameraKeamanan extends PerangkatRumah {

    public KameraKeamanan() {
        super("Kamera Keamanan");
    }

    @Override
    public int hitungDayaWatt() {
        return 8;
    }

    @Override
    public void jalankanFungsiUtama() {
        System.out.println(getNama() + " merekam halaman depan.");
    }
}
