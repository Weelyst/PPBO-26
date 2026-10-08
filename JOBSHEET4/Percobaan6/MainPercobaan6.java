package PPBO-26.JOBSHEET4.Percobaan6;

public class MainPercobaan6 {
    public static void main(String[] args) {
Laptop laptop = new Laptop("Thinkpad");
Printer printer = new Printer("Epson L3110");
laptop.cetakDokumen(printer, "Laporan.pdf");
}
}
