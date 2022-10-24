import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double totalPrice = 0;
        boolean done = false;

        do
        {
            itemPrice = SafeInput.getRangedDouble(in, "Please enter price of item  ", 0.50, 9.99);
            totalPrice = totalPrice + itemPrice;
            done = SafeInput.getYNConfirm(in, "Did you purchase another item?  ");
        }while(done);

        System.out.print("Total price is: " + totalPrice);

    }
}