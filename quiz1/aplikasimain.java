// Averose Arthur R / TI-2G / 254107020042
public class aplikasimain {
    public static void main(String[] args) {
        Studio AAA = new Studio ("Studio AAA", 100000);
        System.out.println(AAA.info());

        reservasi rsv1 = new reservasi(1, 2, "Operator A");
        System.out.println(rsv1.info());

        operator opr = new operator("Operator A", 5000);
        System.out.println(opr.info());

}
}