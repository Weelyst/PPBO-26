public class ClassB2 extends ClassA2 {
    private int z;
    public void setZ(int z) {
        this.z = z;
    }
    public void getNilaiZ() {
        System.out.println("nilai z: " + z);
    }
    public void getJumlah() {
    System.out.println("jumlah: " + (getX() + getY() + z));
    }
}
