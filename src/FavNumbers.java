import java.util.Scanner;

public class FavNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int favInt = 0;
        double favDouble = 0;

        favInt = SafeInput.getInt(in, "Enter your fav Int");
        System.out.println("Your favourite Int is " + favInt);
        favDouble = SafeInput.getDouble(in, "Enter your fav Double");
        System.out.println("Your favourite Double is " + favDouble);
    }

}

