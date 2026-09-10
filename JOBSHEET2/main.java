package JOBSHEET2;


public class main {
    public static void main(String[] args) {
        Rectangle[] shapes = new Rectangle[3];
        
        shapes[0] = new Rectangle(6,  4);
        shapes[1] = new Rectangle(3, 3);
        shapes[2] = new Rectangle(8, 2);

        for (Rectangle r : shapes){
            System.out.println("area: " + r.area() + ", Perimeter: " + r.perimeter());
        }
        

       circle c = new circle(5);
        System.out.println("Luas lingkaran: " + c.area());
        System.out.println("Keliling lingkaran: " + c.circumference());
        

       

       Student s = new Student("nina", "123", 4);
       System.out.println(s.describe());




}
}