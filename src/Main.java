// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
        System.out.println("enter price: ");
        int price = 50; //Place holder
        double saleTax = 0.00;
        if (price >= 100) //Condition
        {
            saleTax = 0.00; //I dont know how to round to second place.
            System.out.println("The sale tax is: $" + saleTax);
            System.out.println("The price is: $" + price);
        }
        else
        {
            saleTax = price * .02;
            System.out.println("The sale tax is: $" + saleTax);
            System.out.println("The price is: $" + price);
        }
    }
}