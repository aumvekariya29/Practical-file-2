public class P2_5main {
    public static void main(String[] args) {
        P2_5 p1=new P2_5();
        P2_5 sc1= new P2_5();
        P2_5 sc2=new P2_5();
        P2_5 sc3 =new P2_5();

        System.out.println("The average of the numbers is :"+sc1.getAverage(5));    //call the function getAverage
        System.out.println("The average of the numbers is :"+sc2.getAverage(5,9)); //call an overloaded function getAverage
        System.out.println("The average of the numbers is :"+sc3.getAverage(5,7,10));  //call an overloaded function getAverage
        System.out.println("This program is made by 21CE150 Aum");
    }
}
