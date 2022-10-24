import java.util.Scanner;
public class Reggie {
    public static void main(String[] args)
    {
     Scanner in = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(in, "Enter your SSN ###-##-####", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your ssn is " +ssn + ".");

        String ucM = SafeInput.getRegExString(in, "Enter your MNumber M#####", "(M|m)\\d{5}");
        System.out.println("Your MNumber is: " + ucM);

        String menu = SafeInput.getRegExString(in, "Enter your menu choice", "[OoSsVvQq]");
        System.out.println("You chose " + menu);
    }
}
