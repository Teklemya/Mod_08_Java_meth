import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int year = 0;
        int month = 0;
        int date =0;
        int hour = 0;
        int min = 0;

        year = SafeInput.getRangedInt(in, "Enter the your birth year ", 1950, 2010);
        System.out.println("The year you choose is " + year);
        month = SafeInput.getRangedInt(in, "Enter the your birth month ", 1, 12);
        System.out.println("The year you choose is " + month);
        if(month == 2)
        {
            date = SafeInput.getRangedInt(in, "Enter the your birth date ", 1, 28);
            System.out.println("The year you choose is " + date);
        } else if (month == 4 || month == 6 || month == 10 || month == 11 ) {
            date = SafeInput.getRangedInt(in, "Enter the your birth date ", 1, 30);
            System.out.println("The year you choose is " + date);
        }else {
            date = SafeInput.getRangedInt(in, "Enter the your birth date ", 1, 31);
            System.out.println("The year you choose is " + date);
        }

        hour = SafeInput.getRangedInt(in, "Enter the your birth hours ", 1, 24);
        System.out.println("The hour you choose is " + hour);
        min = SafeInput.getRangedInt(in, "Enter the your birth minute ", 1, 60);
        System.out.println("The minute you choose is " + min);
    }

}
