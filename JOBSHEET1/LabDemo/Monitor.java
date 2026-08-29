public class Monitor {
    // 2 Atribut dasar
    String merk;
    int ukuranLayar;

    // Constructor
    public Monitor(String merk, int ukuranLayar) {
        this.merk = merk;
        this.ukuranLayar = ukuranLayar;
    }

    // 3 Method (termasuk cetakInformasi)
    public void nyalakan() {
        System.out.println("Monitor " + merk + " menyala.");
    }

    public void matikan() {
        System.out.println("Monitor " + merk + " dimatikan.");
    }

    public void cetakInformasi() {
        System.out.println("=== Detail Monitor ===");
        System.out.println("Merk: " + merk);
        System.out.println("Ukuran Layar: " + ukuranLayar + " inci");
    }
}