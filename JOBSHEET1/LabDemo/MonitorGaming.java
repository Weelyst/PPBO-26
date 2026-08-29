public class MonitorGaming extends Monitor {
    // 2 Atribut khusus
    int refreshRate;
    boolean fiturRgb;

    // Constructor
    public MonitorGaming(String merk, int ukuranLayar, int refreshRate, boolean fiturRgb) {
        super(merk, ukuranLayar); // Memanggil constructor class induk
        this.refreshRate = refreshRate;
        this.fiturRgb = fiturRgb;
    }

    // 3 Method (termasuk cetakInformasi)
    public void aktifkanModeGaming() {
        System.out.println("Mode gaming diaktifkan pada monitor " + merk);
    }

    public void setRefreshRate(int hz) {
        this.refreshRate = hz;
        System.out.println("Refresh rate diubah ke " + hz + "Hz");
    }

    @Override
    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Refresh Rate: " + refreshRate + " Hz");
        System.out.println("Fitur RGB: " + (fiturRgb ? "Aktif" : "Tidak Ada"));
    }
}