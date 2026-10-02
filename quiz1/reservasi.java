// Averose Arthur R / TI-2G / 254107020042
public class reservasi {
        private int kodereservasi;
        private int jumlahtiket;
        private String namaoperator;

        public reservasi(int kodereservasi, int jumlahtiket, String namaoperator) {
            this.kodereservasi = kodereservasi;
            this.jumlahtiket = jumlahtiket;
            this.namaoperator = namaoperator;
        }
        public void setkodereservasi(int kodereservasi) {
            this.kodereservasi = kodereservasi;
        }
        public void setjumlahtiket(int jumlahtiket) {
            this.jumlahtiket = jumlahtiket;
        }
        public void setnamaoperator(String namaoperator) {
            this.namaoperator = namaoperator;
        }
        public int getkodereservasi() {
            return kodereservasi;
        }

        public String getnamaoperator() {
            return namaoperator;
        }

        public int getjumlahtiket() {
            return jumlahtiket;
        }

        public String info() {
            String info = " ";
            info += "Kode Reservasi: " + this.kodereservasi + "\n";
            info += "Jumlah Tiket: " + this.jumlahtiket + "\n";
            info += "Nama Operator: " + this.namaoperator + "\n";
            return info;
        }

       
    }


