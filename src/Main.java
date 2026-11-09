import java.util.List;

public class Main {
    public static void main(String[] args) throws ReflectiveOperationException {
        Lampu lampu = new Lampu();
        PendinginRuangan pendingin = new PendinginRuangan();
        PusatKendali pusat = new PusatKendali();

        System.out.println("== 1. Polimorfisme melalui kelas abstrak ==");
        lampu.aturKecerahan(50);
        pusat.daftarkan(lampu);
        pusat.daftarkan(pendingin);
        pusat.daftarkan(new KameraKeamanan());
        pusat.daftarkanDariNamaKelas(args.length > 0 ? args[0] : "PenyiramTanaman");
        pusat.jalankanSemua(2);

        System.out.println("\n== 2. Laporan daya ==");
        pusat.cetakLaporanDaya();

        System.out.println("\n== 3. Satu antarmuka untuk kelas yang tidak sekerabat ==");
        PengingatTagihan tagihan = new PengingatTagihan("listrik");
        List<DapatDijadwalkan> jadwalHarian = List.of(lampu, pendingin, tagihan);
        String[] waktu = {"18.00", "21.00", "tanggal 20"};
        for (int i = 0; i < jadwalHarian.size(); i++) {
            jadwalHarian.get(i).aturJadwal(waktu[i]);
            System.out.println(jadwalHarian.get(i).getJadwal());
        }

        System.out.println("\n== 4. Pembuktian relasi is-a oleh kompilator ==");
        PerangkatRumah sebagaiPerangkat = lampu;     // lolos karena pewarisan
        DapatDijadwalkan sebagaiTerjadwal = lampu;   // lolos karena antarmuka
        // SensorSuhu sebagaiSensor = pendingin;     // gagal karena komposisi bukan is-a
        System.out.println(sebagaiPerangkat.getNama() + " adalah PerangkatRumah.");
        System.out.println(sebagaiPerangkat.getNama() + " juga DapatDijadwalkan: " + sebagaiTerjadwal.getJadwal());
    }
}
