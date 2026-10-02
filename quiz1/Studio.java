// Averose Arthur TI-2G / 254107020042
public class Studio {
        private String namastudio;
        private int tarifsewa;

        public Studio(String namastudio, int tarifsewa) {
            this.namastudio = namastudio;
            this.tarifsewa = tarifsewa;
        }
        public void setNamaStudio(String namastudio) {
        
            this.namastudio = namastudio;
        }

         public String getNamastudio() {
            return namastudio;
        }
         public void setTarifsewa(int tarifsewa) {
            this.tarifsewa = tarifsewa;
        }

        public int getTarifsewa() {
            return tarifsewa;
        }


        public String info() {
          String info = " ";
            info += "Nama Studio: " + this.namastudio + "\n";
            info += "Tarif Sewa: " + this.tarifsewa + "\n";
            return info;

        }

       
    }
