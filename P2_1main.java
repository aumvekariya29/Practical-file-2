public class P2_1main {
    public static void main(String[] args) {
        P2_1Circle obj = new P2_1Circle();
        P2_1Circle obj2 = new P2_1Circle(1);
        System.out.println("Area of the circle is : "+obj.getArea(obj.radius));
        System.out.println("Perimeter of the circle is : "+obj.getPerimeter(obj.radius));
        System.out.println("This program is made by 21CE150 Aum");
    }
}
