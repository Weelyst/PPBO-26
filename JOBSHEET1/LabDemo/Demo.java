public class Demo {
    public static void main(String[] args) {
        // h. Instansiasi satu buah objek untuk setiap class
        MonitorGaming monitorG = new MonitorGaming("ASUS ROG", 27, 144, true);
        MonitorKantor monitorK = new MonitorKantor("Dell Office", 24, true, true);
        Keyboard keyboardL = new Keyboard("Mekanikal", "Wireless");
        Mouse mouseL = new Mouse(3200, 6);

        // i. Terapkan setiap method untuk setiap objek yang dibuat

        // Executing Monitor Gaming methods
        monitorG.cetakInformasi();
        monitorG.nyalakan();
        monitorG.aktifkanModeGaming();
        monitorG.setRefreshRate(165);
        monitorG.matikan();
        System.out.println("-----------------------------------");

        // Executing Monitor Kantor methods
        monitorK.cetakInformasi();
        monitorK.nyalakan();
        monitorK.aktifkanFilterCahaya();
        monitorK.setModeHemat(true);
        monitorK.matikan();
        System.out.println("-----------------------------------");

        // Executing Keyboard methods
        keyboardL.cetakInformasi();
        keyboardL.ketik();
        keyboardL.nyalakanLampu();
        System.out.println("-----------------------------------");

        // Executing Mouse methods
        mouseL.cetakInformasi();
        mouseL.klikKiri();
        mouseL.scroll();
    }
}