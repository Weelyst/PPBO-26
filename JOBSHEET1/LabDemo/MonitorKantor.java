public class MonitorKantor extends Monitor {
    // 2 Atribut khusus
    boolean hematEnergi;
    boolean filterCahayaBiru;

    // Constructor
    public MonitorKantor(String merk, int ukuranLayar, boolean hematEnergi, boolean filterCahayaBiru) {
        super(merk, ukuranLayar);
        this.hematEnergi = hematEnergi;
        this.filterCahayaBiru = filterCahayaBiru;
    }

    // 3 Method (termasuk cetakInformasi)
    public void aktifkanFilterCahaya() {
        this.filterCahayaBiru = true;
        System.out.println("Filter cahaya biru aktif untuk perlindungan mata.");
    }

    public void setModeHemat(boolean aktif) {
        this.hematEnergi = aktif;
        System.out.println("Mode hemat energi: " + (aktif ? "Aktif" : "Nonaktif"));
    }

    @Override
    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Hemat Energi: " + (hematEnergi ? "Ya" : "Tidak"));
        System.out.println("Filter Cahaya Biru: " + (filterCahayaBiru ? "Ya" : "Tidak"));
    }
}