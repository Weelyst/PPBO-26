package MotorEncapsulation;

public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;
    private int KecepatanMaks = 100;

    public void nyalakanMesin(){
        kontakOn = true;

    }

    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;

    }

    public void tambahKecepatan(){
        if(kontakOn == true){
            if (kecepatan + 5 <= KecepatanMaks) {
                kecepatan += 5;
        } else {
            kecepatan = KecepatanMaks;
        System.out.println("Kecepatan sudah mencapai batas maksimal" + KecepatanMaks );
            }
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin mati!\n");
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
