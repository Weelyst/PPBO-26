public class Mouse {

    int dpi;
    int jumlahTombol;


    public Mouse(int dpi, int jumlahTombol) {
        this.dpi = dpi;
        this.jumlahTombol = jumlahTombol;
    }

    public void klikKiri() {
        System.out.println("Melakukan aksi klik kiri.");
    }

    public void scroll() {
        System.out.println("Menggulirkan halaman ke bawah.");
    }

    public void cetakInformasi() {
        System.out.println("=== Detail Mouse ===");
        System.out.println("DPI Sensitivitas: " + dpi);
        System.out.println("Jumlah Tombol: " + jumlahTombol);
    }
}