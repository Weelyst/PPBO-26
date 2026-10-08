## Averose Arthur Rahman / TI 2G - 06


[Code Percobaan 1 final](Percobaan1)
output percobaan 1

Merk Laptop = Thinkpad
Merk Processor = Intel i5
Cache Memory = 4,00
Merk Laptop = Thinkpad
Merk Processor = Intel i5
Cache Memory = 3,00

## 1
1. Di dalam class Processor dan class Laptop, terdapat method setter dan getter untuk masingmasing atributnya. Apakah gunanya method setter dan getter tersebut?
 Agar dapat memanggil (get) dan merubah (set) suatu nilai dari class lain yang bersifat private

2. Di dalam class Processor dan class Laptop, masing-masing terdapat konstruktor default dan
konstruktor berparameter. Bagaimanakah beda penggunaan dari kedua jenis konstruktor
tersebut?  
    Konstruktor Default (Tanpa Parameter): Digunakan untuk membuat objek kosongan tanpa langsung mengisi nilai atributnya saat instansiasi
    "Processor p1 = new Processor(); 1.setMerk("Intel i5");"

    Konstruktor Berparameter: Digunakan untuk membuat objek sekaligus langsung menginisialisasi nilai atribut-atributnya secara praktis dalam satu baris saat instansiasi.
    " Laptop l2 = new Laptop("Thinkpad", new Processor("Intel i5", 3)); "



3. Perhatikan class Laptop, di antara 2 atribut yang dimiliki (merk dan proc), atribut manakah yang
bertipe object? Baris kode manakah yang menunjukkan bahwa class Laptop memiliki relasi dengan
class Processor?
    Atribut proc, " private Processor proc; "

4. Perhatikan pada class Laptop, apakah guna dari sintaks proc.info()?

    untuk memanggil method info() milik objek Processor (proc). Kelas Laptop tidak perlu mencetak detail prosesor sendiri, tapi memanggil fungsi cetak informasi prosesor ke objek Processor itu sendiri

5. Pada Langkah 8, objek p dibuat lebih dulu baru diberikan ke constructor Laptop. Pada Langkah 10,
objek Processor dibuat langsung di dalam argumen constructor Laptop (tanpa variabel p). Apakah
keduanya menghasilkan output yang berbeda? Mengapa?

    Kedua cara tersebut pada akhirnya sama-sama mengirimkan referensi objek Processor yang valid ke dalam konstruktor/setter kelas Laptop. Bedanya hanya pada ada/tidaknya variabel penyimpan sementara (p1) sebelum dimasukkan sebagai argumen.

6. Secara kode, apakah relasi Laptop-Processor pada percobaan ini termasuk Aggregation atau
Composition? Tunjukkan baris kode yang menjadi bukti jawabanmu
Andaikan constructor Laptop diubah menjadi seperti berikut, sehingga Processor dibuat sendiri di
dalam Laptop, bukan diterima sebagai parameter:
public Laptop (String merk) {
 this.merk = merk;
 this.proc = new Processor ("Generic", 1);
}
Apakah relasi Laptop-Processor pada versi ini masih Aggregation? Jelaskan alasannya :
Pembuatan objek Processor dilakukan di dalam konstruktor kelas Laptop itu sendiri (this.proc = new Processor("Generic", 1);). Artinya:
Keberadaan dan siklus hidup objek Processor sepenuhnya terikat dan dikontrol oleh objek Laptop.
Objek Processor tidak bisa ada secara independen di luar objek Laptop. Jika objek Laptop dihancurkan, maka objek Processor di dalamnya juga ikut hancur. 

## 2
1. Perhatikan class Pelanggan. Pada baris program manakah yang menunjukkan bahwa class Pelanggan memiliki relasi dengan class Mobil dan class Sopir

private Mobil mobil;
private Sopir sopir;


2. Perhatikan method hitungBiayaSopir pada class Sopir, serta method hitungBiayaMobil pada class Mobil. Mengapa method tersebut harus memiliki argument hari, padahal hari sendiri adalah
atribut milik Pelanggan, bukan milik Mobil atau Sopir?

Karena kelas Mobil dan Sopir tidak menyimpan atribut durasi sewa (hari). Atribut hari dikelola oleh Pelanggan, sehingga saat menghitung biaya per hari, nilai hari harus dikirimkan dari Pelanggan melalui parameter method

3. Perhatikan kode dari class Pelanggan. Untuk apakah perintah mobil.hitungBiayaMobil(hari)
dan sopir.hitungBiayaSopir(hari)?

Perintah tersebut digunakan untuk meminta objek mobil dan sopir menghitung biaya masing-masing berdasarkan jumlah hari sewa, yang mana hasilnya akan dijumlahkan oleh Pelanggan untuk mendapatkan biaya total.

4. Perhatikan class MainPercobaan2. Untuk apakah sintaks p.setMobil(m) dan p.setSopir(s)?

5. Untuk apakah proses p.hitungBiayaTotal()?
Proses tersebut berfungsi untuk menghitung total keseluruhan biaya rental yang harus dibayar oleh pelanggan.

6. Pada Langkah 7, p.getMobil().getMerk() memanggil dua method sekaligus secara berantai.
Jelaskan urutan eksekusinya: objek apa yang dikembalikan p.getMobil(), dan objek apa yang
kemudian dipanggil .getMerk()-nya?

Urutan eksekusi rantai method p.getMobil().getMerk():
p.getMobil() dieksekusi terlebih dahulu dan mengembalikan objek Mobil yang terhubung pada pelanggan p.   
Kemudian method .getMerk() dipanggil pada objek Mobil hasil kembalian tersebut untuk mengambil nama merek mobilnya.

7. Andaikan p.setMobil(m) tidak pernah dipanggil lalu p.hitungBiayaTotal() dijalankan, error
apa yang akan muncul? Jelaskan mengapa error itu terjadi, dikaitkan dengan konsep referensi objek
yang sudah kita pelajari sebelumnya.

Analisis error jika p.setMobil(m) tidak dipanggil:
Akan terjadi error NullPointerException. Penyebabnya adalah atribut mobil di dalam objek Pelanggan masih bernilai null (belum menunjuk ke referensi objek Mobil manapun di memori). Saat hitungBiayaTotal() memanggil mobil.hitungBiayaMobil(hari), program mencoba mengakses method dari variabel yang bernilai null.

## 3
1. Di dalam method info() pada class KeretaApi, baris this.masinis.info() dan
this.asisten.info() digunakan untuk apa?

Dipakai untuk memanggil method info() dari kelas Pegawai guna mengambil dan menampilkan data perorangan (NIP dan Nama) dari masinis maupun asisten.

2. Apa hasil output dari MainPertanyaan sebelum diperbaiki (Langkah 8)? Mengapa hal tersebut dapat
terjadi?
Program akan crash/berhenti dengan pesan kesalahan NullPointerException. Hal ini terjadi karena objek KeretaApi dibuat menggunakan konstruktor 3-parameter di mana atribut asisten tidak diisi sehingga bernilai null, lalu method info() mencoba mengeksekusi this.asisten.info().

3. Kaitkan dengan materi referensi objek: apa isi variabel asisten di dalam objek KeretaApi yang
dibuat lewat constructor 3-parameter, sebelum guard clause ditambahkan?
Variabel asisten berisi null, yaitu nilai default untuk variabel bertipe referensi objek yang belum diinstansiasi atau diisi.

4. Setelah guard clause ditambahkan (Langkah 9), apakah objek masinis juga perlu dicek dengan cara
yang sama? Perhatikan kedua constructor KeretaApi, apakah mungkin masinis bernilai null?
Jelaskan.
Tidak perlu. konstruktor yang ada pada kelas KeretaApi (baik konstruktor 3-parameter maupun 4-parameter), variabel masinis selalu menjadi parameter wajib dan langsung diinisialisasi. Sehingga masinis tidak mungkin bernilai null

5. Kelas Pegawai dipakai lewat dua atribut berbeda (masinis dan asisten) pada KeretaApi. Apakah
ini membuat KeretaApi punya dua objek Pegawai yang berbeda, atau satu objek Pegawai yang
dipakai dua kali? Jelaskan berdasarkan kode pada Langkah 6. 

Menggunakan dua objek Pegawai yang berbeda. Berdasarkan kode Langkah 6, terdapat dua pemanggilan new Pegawai(...) terpisah, yaitu untuk objek masinis ("Spongebob") dan asisten ("Patrick") yang menunjuk ke alamat memori yang berbeda.

## 4

1. Pada main program dalam class MainPercobaan4, berapakah jumlah kursi dalam Gerbong A?
Jumlah kursi adalah 10 kursi (diinisialisasi dengan new Gerbong("A", 10)).

2. Perhatikan potongan kode if (this.penumpang != null) { ... } pada method info()
dalam class Kursi. Apa maksud kode tersebut?
Kode tersebut merupakan guard clause untuk memeriksa apakah kursi tersebut sudah terisi penumpang atau masih kosong. Jika kursi terisi (penumpang != null), informasi penumpang akan dicetak; jika kosong, program tidak memanggil penumpang.info() sehingga terhindar dari NullPointerException.

3. Mengapa pada method setPenumpang() dalam class Gerbong, nilai nomor dikurangi dengan angka
1?
Karena penomoran indeks pada Array di Java dimulai dari indeks 0, sedangkan penomoran kursi manusia secara umum dimulai dari nomor 1.

4. Instansiasi objek baru budi dengan tipe Penumpang, kemudian masukkan objek baru tersebut pada
gerbong dengan gerbong.setPenumpang(budi, 1), menimpa Mr. Krab yang sudah duduk di
sana. Apakah yang terjadi? Apakah Java memberi peringatan/error?
Nilai referensi penumpang pada kursi tersebut langsung digantikan oleh objek budi. Java tidak memberikan warning/error, karena operasi penggantian nilai variabel referensi adalah tindakan valid.

5. Modifikasi program sehingga tidak diperkenankan menduduki kursi yang sudah ada penumpang lain
(tambahkan pengecekan pada Gerbong.setPenumpang() sebelum baris arrayKursi[nomor -
1].setPenumpang(...) dijalankan).

public void setPenumpang(Penumpang penumpang, int nomor) {
    if (this.arrayKursi[nomor - 1].getPenumpang() != null) {
        System.out.println("Kursi nomor " + nomor + " sudah terisi!");
    } else {
        this.arrayKursi[nomor - 1].setPenumpang(penumpang);
    }
}

6. Bandingkan tiga bentuk relasi has-a yang sudah kita praktikkan: Laptop-Processor (Percobaan 1, 1-
1), KeretaApi-Pegawai (Percobaan 3, dua relasi 1-1 bernama), dan Gerbong-Kursi (Percobaan 4, 1..*).
Untuk kasus seperti apa kita akan memilih array, dan untuk kasus seperti apa kita akan memilih
atribut bernama satu-satu?

Array: Dipakai jika jumlah objek sejenis banyak, tidak tetap/fleksibel, serta memiliki perlakuan yang sama tanpa perlu penamaan peran secara individual (contoh: daftar kursi di gerbong).

Atribut bernama: Dipakai jika jumlah objek pasti/terbatas dan setiap objek memiliki peran (role) yang spesifik dan berbeda secara konseptual (contoh: masinis dan asisten). 

7. Terapkan kriteria kode (siapa yang memanggil new) pada dua relasi has-a di Percobaan ini: GerbongKursi dan Kursi-Penumpang. Manakah yang Aggregation dan manakah yang Composition? Tunjukkan
baris kode yang menjadi bukti untuk masing-masing.

Gerbong-Kursi adalah Composition: Karena objek Kursi diinstansiasi secara internal oleh kelas Gerbong melalui panggilan new Kursi(...) pada method initKursi().

(Gerbong.java): this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));

Kursi-Penumpang adalah Aggregation: Karena objek Penumpang dibuat di luar kelas Kursi lalu diset melalui method setPenumpang().

Bukti kode (Kursi.java): public void setPenumpang(Penumpang penumpang) { this.penumpang = penumpang; }

## 5
1. Pada class Mobil, baris manakah yang menunjukkan bahwa Mesin adalah bagian yang “dimiliki
secara eksklusif” oleh Mobil (bukan sekadar “dipinjam”)?
this.mesin = new Mesin();

2. Apa yang terjadi secara desain jika ditambahkan method setMesin(Mesin mesin) pada class
Mobil? Apakah relasi ini akan tetap menjadi Composition? Jelaskan.
Karena dengan adanya setter, pihak luar dapat mengganti atau menyisipkan objek Mesin yang dibuat di luar lifecy

3. Bandingkan dengan Percobaan 1 (Laptop-Processor): sebutkan satu perbedaan baris kode yang
membuat salah satunya Aggregation dan yang lain Composition.

Percobaan 1 (Aggregation): Parameter konstruktor menerima objek dari luar public Laptop(String merk, Processor proc).

Percobaan 5 (Composition): Konstruktor menciptakan sendiri objeknya this.mesin = new Mesin(); tanpa menerima parameter Mesin.

4. Jika objek mobil di MainPercobaan5 di-set null setelah tampilkanInfo() dipanggil, apa yang
terjadi pada objek Mesin miliknya? Bandingkan dengan nasib objek Processor pada Percobaan 1
seandainya objek Laptop-nya dihapus, apakah Processor tersebut masih bisa “diselamatkan” oleh
kode lain? Kenapa Mesin tidak bisa?

Mesin (Composition): Objek Mesin akan ikut hilang/dihapus oleh Garbage Collector, karena tidak ada variabel lain yang menyimpan referensi ke Mesin tersebut selain objek Mobil.   

Processor (Aggregation): Objek Processor masih aman/bertahan di memori jika variabel asal (seperti p pada Langkah 8) masih menyimpan referensinya. 

5. Coba (secara terpisah, boleh di file/package percobaan sendiri) tambahkan constructor kedua pada
Mobil yang menerima parameter Mesin, mirip pola Percobaan 1: public Mobil(String merek,
Mesin mesin) { this.merek = merek; this.mesin = mesin; }. Kalau constructor ini yang
dipakai, apakah Mobil-Mesin berubah menjadi Aggregation? Jelaskan alasannya. 

Ya, berubah menjadi Aggregation. Karena objek Mesin kini disuplai dari luar kelas Mobil, sehingga masa hidup Mesin tidak lagi terikat sepenuhnya pada pembuatan kelas Mobil.

## 6
1. Apakah class Laptop pada percobaan ini memiliki atribut bertipe Printer? Bandingkan dengan
Percobaan 1, di mana Processor disimpan sebagai atribut Laptop.

Tidak ada. Pada Percobaan 1, Processor disimpan sebagai atribut kelas (private Processor proc), sedangkan pada Percobaan 6, Printer hanya hadir sebagai parameter lokal pada method cetakDokumen()

2. Setelah method cetakDokumen() selesai dijalankan, apakah Laptop masih menyimpan referensi ke
objek printer yang tadi dipakai? Jelaskan berdasarkan baris kode class Laptop.

Tidak menyimpan. Variabel parameter printer hanya hidup dalam scope pemanggilan method cetakDokumen(). Setelah method selesai dieksekusi, referensi tersebut dibuang

3. Mengapa relasi Laptop-Printer pada percobaan ini disebut Dependency (uses-a), bukan Aggregation,
meskipun sama-sama melibatkan dua objek yang saling berinteraksi?

Karena kelas Laptop hanya menggunakan (uses) objek Printer sementara waktu untuk menyelesaikan suatu operasi/method, tanpa memiliki (has-a) ataupun menyimpan objek Printer tersebut sebagai atribut tetap.

4. Coba ubah kode Laptop supaya Printer disimpan sebagai atribut (mis. private Printer
printerDefault, diisi lewat constructor atau setter, lalu dipakai kembali di cetakDokumen()
tanpa parameter Printer). Apakah relasi ini sekarang berubah dari Dependency menjadi
Aggregation? Jelaskan

Ya, relasinya berubah dari Dependency menjadi Aggregation. Hal ini terjadi karena Laptop kini memiliki atribut bertipe Printer (has-a), yang mempertahankan referensi objek tersebut sepanjang masa hidup Laptop

5. Lengkapi tabel berikut dengan kata-katamu sendiri (boleh dijawab di laporan): untuk masing-masing
dari Aggregation, Composition, dan Dependency, sebutkan (a) apakah objek part disimpan sebagai
atribut atau tidak, dan (b) siapa yang memanggil new untuk membuat objek part tersebut. 


Aggregation = Ya (disimpan sebagai atribut) = Luar Kelas (Main/Caller lalu diset via konstruktor/setter)   

Composition = Ya (disimpan sebagai atribut) = Dalam Kelas Induk (diinisialisasi langsung di dalam konstruktor/method internal)

Dependency = Tidak (hanya lewat parameter method) = Luar Kelas (dibuat di luar lalu dilewatkan sebagai variabel parameter temporary)

## tugas mandiri


## 1. Diagram Kelas (UML Class Diagram Concept)

* Item : Menyimpan data barang game (misal: Skin, Diamond, Sword).
* AkunGame : Menyimpan detail akun penjual/pembeli. Berelasi Aggregation dengan Item
* Transaksi : Menyimpan data pembelian. Berelasi Composition dengan BuktiPembayaran (dibuat otomatis di dalam konstruktor transaksi) dan Aggregation dengan Item.
* FakturPrinter : Kelas pembantu untuk mencetak resi. Berelasi Dependency dengan Transaksi (hanya lewat parameter method).

---

## 2. Kode Program Java


## a. Class Item

```java

public class Item {
    private String namaItem;
    private double harga;

    public Item(String namaItem, double harga) {
        this.namaItem = namaItem;
        this.harga = harga;
    }

    public String getNamaItem() {
        return namaItem;
    }

    public double getHarga() {
        return harga;
    }
}

```

### b. Class `BuktiPembayaran

```java

public class BuktiPembayaran {
    private String idTransaksi;
    private String status;

    public BuktiPembayaran(String idTransaksi) {
        this.idTransaksi = idTransaksi;
        this.status = "LUNAS / VERIFIED";
    }

    public String getInfoBukti() {
        return "ID TRX: " + idTransaksi + " | Status: " + status;
    }
}


## c. Class `AkunGame.java` (Aggregation dengan `Item`)

```java
package id.ac.polinema.relasiclass.tugas;

public class AkunGame {
    private String username;
    private Item inventory; // AGGREGATION: Akun memiliki Item

    public AkunGame(String username) {
        this.username = username;
    }

    // Setter Injection untuk mengisi item ke akun
    public void setInventory(Item inventory) {
        this.inventory = inventory;
    }

    public String getUsername() {
        return username;
    }

    public Item getInventory() {
        return inventory;
    }
}

```

## d. Class `Transaksi.java` (Composition dengan `BuktiPembayaran`)

```java
package id.ac.polinema.relasiclass.tugas;

public class Transaksi {
    private String idTransaksi;
    private Item itemDibeli; // AGGREGATION: Item diterima dari luar
    private BuktiPembayaran bukti; // COMPOSITION: Bukti dibuat langsung di dalam

    public Transaksi(String idTransaksi, Item itemDibeli) {
        this.idTransaksi = idTransaksi;
        this.itemDibeli = itemDibeli;
        // COMPOSITION: Objek BuktiPembayaran dibuat langsung oleh Transaksi
        this.bukti = new BuktiPembayaran(idTransaksi);
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public Item getItemDibeli() {
        return itemDibeli;
    }

    public BuktiPembayaran getBukti() {
        return bukti;
    }
}

```

## e. Class `FakturPrinter.java` (Dependency dengan `Transaksi`)

```java
package id.ac.polinema.relasiclass.tugas;

public class FakturPrinter {
    // DEPENDENCY: Objek Transaksi hanya dikirim via parameter method, tidak disimpan sebagai atribut
    public void cetakResi(Transaksi transaksi) {
        System.out.println("====== RESI JB ITEM IN-GAME ======");
        System.out.println("ID Transaksi : " + transaksi.getIdTransaksi());
        System.out.println("Item         : " + transaksi.getItemDibeli().getNamaItem());
        System.out.println("Harga        : Rp " + transaksi.getItemDibeli().getHarga());
        System.out.println("Bukti Bayar  : " + transaksi.getBukti().getInfoBukti());
        System.out.println("==================================");
    }
}

```

## f. Class `MainTugas.java` (Kelas Penguji)

```java
package id.ac.polinema.relasiclass.tugas;

public class MainTugas {
    public static void main(String[] args) {
        // 1. Inisialisasi Objek Item & Akun
        Item sword = new Item("Dragon Slayer Sword", 150000);
        AkunGame buyer = new AkunGame("ProGamer99");
        buyer.setInventory(sword);

        // 2. Transaksi dibuat
        Transaksi trx1 = new Transaksi("TRX-001", sword);

        // 3. Cetak menggunakan FakturPrinter
        FakturPrinter printer = new FakturPrinter();
        printer.cetakResi(trx1);
    }
}

```

---

## 3. Penjelasan Jenis Relasi dalam Laporan
1. Aggregation (`AkunGame` $\rightarrow$ `Item` & `Transaksi` $\rightarrow$ `Item`)
* Letak Kode: `public void setInventory(Item inventory)` pada `AkunGame` dan parameter konstruktor `public Transaksi(..., Item itemDibeli)`.
* Alasan: Objek `Item` diciptakan terpisah di luar kelas `AkunGame` maupun `Transaksi`. Jika objek `Transaksi` dihapus, objek `Item` masih tetap ada di memori dan bisa digunakan oleh akun lain.




2. Composition (`Transaksi` $\rightarrow$ `BuktiPembayaran`)
* *Letak Kode: `this.bukti = new BuktiPembayaran(idTransaksi);` di dalam konstruktor `Transaksi`.
*  Alasan: objek `BuktiPembayaran` dibuat secara internal langsung oleh `Transaksi` tanpa ada *setter*. Jika objek `Transaksi` dihapus/dihilangkan, maka `BuktiPembayaran` milik transaksi tersebut juga ikut lenyap dari memori (*lifecycle* terikat erat).




3. Dependency (`FakturPrinter` $\rightarrow$ `Transaksi`)
* Letak Kode: `public void cetakResi(Transaksi transaksi)` pada kelas `FakturPrinter`.
* Alasan: `FakturPrinter` tidak menyimpan atribut bertipe `Transaksi`. Objek `Transaksi` hanya "dipinjam" sementara waktu melalui parameter method saat proses pencetakan resi berlangsung.





---

### **4. Jawaban Pertanyaan Singkat Tugas Mandiri**

**Pertanyaan:** *Bagaimana kita memutuskan sebuah relasi antar class seharusnya Aggregation, Composition, atau Dependency? Sebutkan pertanyaan kunci yang kita ajukan ke diri sendiri saat memutuskan!*

**Jawaban:**
Untuk memutuskan jenis relasi antar kelas, kita mengajukan pertanyaan kunci berikut:

1. **Apakah objek target perlu disimpan sebagai atribut jangka panjang atau hanya dipakai sesaat?** Jika hanya dipakai sesaat dalam method, maka pilih **Dependency**.


2. **Jika disimpan sebagai atribut, apakah objek target diciptakan sendiri di dalam kelas tersebut atau diterima dari luar?** Jika diterima dari luar (bisa hidup tanpa induknya), maka pilih **Aggregation**.


3. **Apakah masa hidup (*lifecycle*) objek target sepenuhnya bergantung pada kelas induknya?** Jika ya (objek tidak bermakna dan akan hancur jika induknya dihapus), maka pilih **Composition**.