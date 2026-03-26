import java.util.Scanner;
interface Calc
{
    void calculate();
}
class Bill implements Calc
{
    String pid,pname;
    int quantity;
    double price,total,amount=0;
    Scanner sc=new Scanner(System.in);
    public void getdata()
    {
        System.out.println("Enter product details");
        System.out.println("=====================");
        System.out.println("Product id:");
        pid=sc.nextLine();
        System.out.println("Product name:");
        pname=sc.nextLine();
        System.out.println("Quantity:");
        quantity=sc.nextInt();
        System.out.println("Price:");
        price=sc.nextDouble();
    }
    public void calculate()
    {
        total=quantity*price;
    }
    public void display()
    {
        System.out.println();
    }

}
