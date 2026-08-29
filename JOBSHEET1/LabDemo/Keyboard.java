public class Keyboard {
    String jenisTuts;
    String koneksi;

    public Keyboard(String jenisTuts, String koneksi) {
        this.jenisTuts = jenisTuts;
        this.koneksi = koneksi;
    }

    public void ketik() {
        System.out.println("Mengetik karakter pada keyboard...");
    }

    public void nyalakanLampu() {
        System.out.println("Lampu backlight keyboard menyala.");
    }

    public void cetakInformasi() {
        System.out.println("=== Detail Keyboard ===");
        System.out.println("Jenis Tuts: " + jenisTuts);
        System.out.println("Jenis Koneksi: " + koneksi);
    }
}