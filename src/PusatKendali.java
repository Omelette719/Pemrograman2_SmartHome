import java.util.ArrayList;
import java.util.List;

public class PusatKendali {
    private final List<PerangkatRumah> daftarPerangkat = new ArrayList<>(); // komposisi

    public void daftarkan(PerangkatRumah perangkat) {
        daftarPerangkat.add(perangkat);
    }

    public void daftarkanDariNamaKelas(String namaKelas) throws ReflectiveOperationException {
        Object objek = Class.forName(namaKelas).getDeclaredConstructor().newInstance();
        daftarkan((PerangkatRumah) objek);
    }

    public void jalankanSemua(double jam) {
        for (PerangkatRumah perangkat : daftarPerangkat) {
            perangkat.nyalakan();
            perangkat.jalankanFungsiUtama(); // polimorfisme
            perangkat.gunakanSelama(jam);
        }
    }

    public void cetakLaporanDaya() {
        double total = 0;
        for (PerangkatRumah perangkat : daftarPerangkat) {
            System.out.printf("%-20s %5d watt %8.3f kWh%n",
                    perangkat.getNama(), perangkat.hitungDayaWatt(), perangkat.getPemakaianKwh());
            total += perangkat.getPemakaianKwh();
        }
        System.out.printf("Total pemakaian: %.3f kWh%n", total);
    }
}
