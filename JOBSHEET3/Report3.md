## Averose Arthur / TI-2G
## JOBSHEET 3

## Percobaan 1

1. Motor
package MotorEncapsulation;

public class Motor {
    public int kecepatan = 0;
    public boolean kontakOn = false;

    public void printStatus(){
        if (kontakOn == true ){
            System.out.println("Kontak On");
        }
        else {
            System.out.println("Kontak Off");

        }
        System.out.println("Kecepatan " + kecepatan+ "\n");
    }
}

2. Motor Demo
package MotorEncapsulation;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.printStatus();
        motor.kecepatan = 50;
        motor.printStatus();
    }
}

output
Kontak Off
Kecepatan 0

Kontak Off
Kecepatan 50

## Percobaan 2
1. Motor
package MotorEncapsulation;

public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;

    public void nyalakanMesin(){
        kontakOn = true;

    }

    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;

    }

    public void tambahKecepatan(){
        if(kontakOn == true){
            kecepatan += 5;
        }
    
    else {
        System.out.println("Mesin mati, kecepatan Nil");
    }
}

    public void printStatus(){
        if (kontakOn == true ){
            System.out.println("Kontak On");
        }
        else {
            System.out.println("Kontak Off");

        }
        System.out.println("Kecepatan " + kecepatan+ "\n");
    }

}

2. motor demo
package MotorEncapsulation;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();
        
        motor.nyalakanMesin();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.matikanMesin();
        motor.printStatus();

    }
}
3. output 
Kontak Off
Kecepatan 0

Mesin mati, kecepatan Nil
Kontak Off
Kecepatan 0

Kontak On
Kecepatan 0

Kontak On
Kecepatan 5

Kontak On
Kecepatan 10

Kontak On
Kecepatan 15

Kontak Off
Kecepatan 0

3.3 Pertanyaan
1. Pada class TestMobil, saat kita menambah kecepatan untuk pertama kalinya, mengapa muncul peringatan “Kecepatan tidak bisa bertambah karena Mesin Off!”? 

- karena kondisi perintah mesin masih dalam off, maka tidak akan ada penambahan kecepatan (if else mesin mati kecepatan = 0)

2. Mengapa atribut kecepatan dan kontakOn diset private?
- untuk mengendalikan mekanisme mesin agar tidak terjadi penambahan atau pengurangan kecepatan yang abnormal


3. Ubah class Motor sehingga kecepatan maksimalnya adalah 100
public void tambahKecepatan(){
        if(kontakOn == true){
            if (kecepatan + 35 <= KecepatanMaks) {
                kecepatan += 35;
        } else {
            kecepatan = KecepatanMaks;
        System.out.println("Kecepatan sudah mencapai batas maksimal" + KecepatanMaks );
            }
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin mati!\n");
        }
    }

    output

    Kontak Off
Kecepatan 0

Kecepatan tidak bisa bertambah karena mesin mati!

Kontak Off
Kecepatan 0

Kontak On
Kecepatan 0

Kontak On
Kecepatan 35

Kontak On
Kecepatan 70

Kecepatan sudah mencapai batas maksimal100
Kontak On
Kecepatan 100

Kontak Off
Kecepatan 0

## Percobaan 3
1. Anggota
package KoperasiGetterSetter;

public class Anggota {
    private String nama;
    private String alamat;
    private float simpanan;
    
    
    public void setNama(String nama){
        this.nama = nama;

    } 
    public void setAlamat ( String alamat){
        this.alamat = alamat;

    }
    public String getNama(){
        return nama;
    }
    public getAlamat(){
        return alamat;

    }
    public float getSimpanan(){
        return simpanan;

    }
    public void setor (float uang){
        simpanan +=uang;

    }
    public void pinjam(float uang){
        simpanan -=uang;
    }
    
}

2. Koperasi Demo
package KoperasiGetterSetter;


public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota();
        anggota1.setNama("Iwan Setiawan");
        anggota1.setAlamat("Jalan Sukarno Hatta no 10");
        anggota1.setor(100000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());

        anggota1.pinjam(5000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());
    }
}


3. output
Simpanan Iwan Setiawan : Rp 100000.0
Simpanan Iwan Setiawan : Rp 95000.0

## Percobaan 4
package KoperasiGetterSetter;

public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota();
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());

        anggota1.setNama("Iwan Setiawan");
        anggota1.setAlamat("Jalan Sukarno Hatta no 10");
        anggota1.setor(100000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());

        anggota1.pinjam(5000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());
    }
}
1. output

Simpanan null : Rp 0.0
Simpanan Iwan Setiawan : Rp 100000.0
Simpanan Iwan Setiawan : Rp 95000.0

2. 
package KoperasiGetterSetter;

public class Anggota {
    private String nama;
    private String alamat;
    private float simpanan;

    Anggota(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
        this.simpanan = 0;
    }
    
    
    public void setNama(String nama){
        this.nama = nama;

    } 
    public void setAlamat ( String alamat){
        this.alamat = alamat;

    }
    public String getNama(){
        return nama;
    }
    public getAlamat(){
        return alamat;

    }
    public float getSimpanan(){
        return simpanan;

    }
    public void setor (float uang){
        simpanan +=uang;

    }
    public void pinjam(float uang){
        simpanan -=uang;
    }
    
}
3. package KoperasiGetterSetter;

public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("Ivan ","Jalan Sukarno Hatta no 10\"");
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());

        anggota1.setNama("Iwan Setiawan");
        anggota1.setAlamat("Jalan Sukarno Hatta no 10");
        anggota1.setor(100000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());

        anggota1.pinjam(5000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());
    }
}

4. output
Simpanan Ivan  : Rp 0.0
Simpanan Iwan Setiawan : Rp 100000.0
Simpanan Iwan Setiawan : Rp 95000.0

Percobaan 3 dan 4
1. Apa yang dimaksud getter dan setter?
getter membaca nilai suatu atribut yang private
setter mengisi / ubah nilai atribut yang private

2. Apa kegunaan dari method getSimpanan()?
Mengakses nilai simpanan yang bersifat private, dapat dibaca diluar class

3. Method apa yang digunakan untuk menambah saldo?
setor

4. Apa yang dimaksud konstruktor?
method khusus dalam kelas yang dipanggil secara otomatis saat objek baru dibuat

5. Sebutkan aturan dalam membuat konstruktor?
Nama konstruktor harus sama persis dengan nama kelasnya.
Tidak boleh memiliki return type
dipanggil dengan new

6. Apakah boleh konstruktor bertipe private?
Konstruktor private biasanya digunakan pada pola desain tertentu
agar kelas tersebut tidak bisa diinstansiasi secara bebas dari luar kelas.

7. Kapan menggunakan konstruktor dengan passing parameter?
Digunakan ketika ingin memberikan nilai awal

8. Apa perbedaan inisialisasi atribut dan instansiasi atribut?
Inisialisasi atribut: Proses memberikan nilai awal pada variabel/atribut.
int saldo = 10000;

Instansiasi atribut (objek): Proses membuat objek baru dari suatu kelas menggunakan kata kunci new dan mengalokasikannya ke dalam memori.

Nasabah nasabah1 = new Nasabah();

9. Apa perbedaan inisialisasi method dan instansiasi method?
Inisialisasi/Pendeklarasian method: Proses membuat atau mendefinisikan struktur method

instansiasi proses menjalankan blok kode method tersebut melalui objek yang telah dibuat.

## TUGAS

1. 
encapdemo
public class EncapDemo
{
    private String name;
    private int age;

    public String getName()
    {
        return name;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int newAge)
    {
        if(newAge > 30)
        {
            age = 30;
        }
        else
        {
            age = newAge;
        }
    }
}

encaptest

public class EncapTest
{
    public static void main(String args[])
    {
        EncapDemo encap = new EncapDemo();
        encap.setName("James");
        encap.setAge(35);

        System.out.println("Name : " + encap.getName());
        System.out.println("Age  : " + encap.getAge());
    }
}


OUTPUT : 
Name : James
Age  : 30

2.  ketika encap.setAge(35) nilai 35 dikirim ke newage, cek kondisi, if (new > 30) / if (35 > 30), kondisi true, maka yang dijalankan age = 30, nilai age dipaksa dengan 30

3. 
public class EncapDemo
{
    private String name;
    private int age;

    public String getName()
    {
        return name;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int newAge)
    {
        if (newAge > 30)
        {
            age = 30; 
        }
        else if (newAge < 18)
        {
            age = 18;
        }
        else
        {
            age = newAge;
        }
    }
}


4. 
Kontainer
public class Kontainer {
    private String nomorResi;
    private String namaPemilik;
    private double kapasitasMaksimal;
    private double beratMuatanSaatIni;

    public Kontainer(String nomorResi, String namaPemilik, double kapasitasMaksimal) {
        this.nomorResi = nomorResi;
        this.namaPemilik = namaPemilik;
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.beratMuatanSaatIni = 0.0;
    }

    public String getNomorResi() {
        return nomorResi;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public double getKapasitasMaksimal() {
        return kapasitasMaksimal;
    }

    public double getBeratMuatanSaatIni() {
        return beratMuatanSaatIni;
    }

    public void tambahMuatan(double berat) {
        if (this.beratMuatanSaatIni + berat > this.kapasitasMaksimal) {
            System.out.println("Maaf, berat muatan melebihi kapasitas maksimal kontainer.");
        } else {
            this.beratMuatanSaatIni += berat;
        }
    }

    public void turunkanMuatan(double berat) {
        if (berat > this.beratMuatanSaatIni) {
            System.out.println("Maaf, berat yang diturunkan melebihi muatan saat ini.");
        } else {
            this.beratMuatanSaatIni -= berat;
        }
    }
}

TesLogistik
public class TestLogistik {
    public static void main(String[] args) {
        Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("Nama Pemilik Kontainer: " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg");

        System.out.println("\nMemasukkan muatan baru seberat 6.000 kg...");
        kontainerAlfa.tambahMuatan(6000);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        System.out.println("\nMemasukkan muatan baru seberat 4.000 kg...");
        kontainerAlfa.tambahMuatan(4000);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        System.out.println("\nMembongkar muat/menurunkan barang seberat 500 kg...");
        kontainerAlfa.turunkanMuatan(500);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        System.out.println("\nMembongkar muat/menurunkan barang seberat 1.500 kg...");
        kontainerAlfa.turunkanMuatan(1500);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
    }
}

Output :
Nama Pemilik Kontainer: PT. Maju Bersama
Kapasitas Maksimal: 5000.0 kg

Memasukkan muatan baru seberat 6.000 kg...
Maaf, berat muatan melebihi kapasitas maksimal kontainer.
Berat muatan saat ini: 0.0 kg

Memasukkan muatan baru seberat 4.000 kg...
Berat muatan saat ini: 4000.0 kg

Membongkar muat/menurunkan barang seberat 500 kg...
Berat muatan saat ini: 3500.0 kg

Membongkar muat/menurunkan barang seberat 1.500 kg...
Berat muatan saat ini: 2000.0 kg

5. public class Kontainer {
    private String nomorResi;
    private String namaPemilik;
    private double kapasitasMaksimal;
    private double beratMuatanSaatIni;

    public Kontainer(String nomorResi, String namaPemilik, double kapasitasMaksimal) {
        this.nomorResi = nomorResi;
        this.namaPemilik = namaPemilik;
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.beratMuatanSaatIni = 0.0;
    }

    public String getNomorResi() {
        return nomorResi;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public double getKapasitasMaksimal() {
        return kapasitasMaksimal;
    }

    public double getBeratMuatanSaatIni() {
        return beratMuatanSaatIni;
    }

    public void tambahMuatan(double berat) {
        if (this.beratMuatanSaatIni + berat > this.kapasitasMaksimal) {
            System.out.println("Maaf, berat muatan melebihi kapasitas maksimal kontainer.");
        } else {
            this.beratMuatanSaatIni += berat;
        }
    }

    public void turunkanMuatan(double berat) {
        double batasMaksimalTurun = 0.5 * this.beratMuatanSaatIni;

        if (berat > batasMaksimalTurun) {
            System.out.println("Maaf, demi keselamatan, pembongkaran muatan satu kali jalan tidak boleh melebihi 50% dari muatan saat ini!");
        } else {
            this.beratMuatanSaatIni -= berat;
        }
    }
}

6. import java.util.Scanner;

public class TestLogistik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membuat objek Kontainer dengan data awal
        Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("=== SISTEM MANAJEMEN KARGO EKSPEDISI ===");
        System.out.println("Nama Pemilik Kontainer: " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg");
        System.out.println("----------------------------------------");

        boolean berjalan = true;

        while (berjalan) {
            System.out.println("\n--- MENU OPERASIONAL KONTAINER ---");
            System.out.println("1. Tambah Muatan Barang");
            System.out.println("2. Turunkan/Bongkar Muatan Barang");
            System.out.println("3. Cek Status Muatan saat ini");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("\nMasukkan berat muatan baru yang ingin ditambahkan (kg): ");
                    double beratTambah = input.nextDouble();
                    kontainerAlfa.tambahMuatan(beratTambah);
                    System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
                    break;

                case 2:
                    System.out.print("\nMasukkan berat muatan yang ingin diturunkan (kg): ");
                    double beratTurun = input.nextDouble();
                    kontainerAlfa.turunkanMuatan(beratTurun);
                    System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
                    break;

                case 3:
                    System.out.println("\n--- STATUS KONTAINER ---");
                    System.out.println("Pemilik            : " + kontainerAlfa.getNamaPemilik());
                    System.out.println("Kapasitas Maksimal : " + kontainerAlfa.getKapasitasMaksimal() + " kg");
                    System.out.println("Muatan Saat Ini    : " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
                    break;

                case 4:
                    System.out.println("\nTerima kasih, program selesai.");
                    berjalan = false;
                    break;

                default:
                    System.out.println("\nPilihan tidak valid! Silakan pilih menu 1-4.");
                    break;
            }
        }

        input.close();
    }
}

7. testbioskop
public class TestBioskop {
    public static void main(String[] args) {
        Tiket tiket1 = new Tiket("Avengers: Endgame", -50000);
        System.out.println("Film: " + tiket1.getJudulFilm());
        System.out.println("Harga Tiket: " + tiket1.getHargaDasar());
        System.out.println("Status Lunas? " + tiket1.isStatusPembayaran());

        System.out.println("\nMemproses pembayaran...");
        tiket1.lakukanPembayaran();
        System.out.println("Status Lunas Terbaru? " + tiket1.isStatusPembayaran());
    }
}

output

Film: Avengers: Endgame
Harga Tiket: 35000.0
Status Lunas? false

Memproses pembayaran...
Status Lunas Terbaru? true