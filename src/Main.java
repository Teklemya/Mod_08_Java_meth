public class Main
{
    public static void main(String[] args)
    {
        sayHello();

        sayHello(2);

        sayMsg("Damn Yishak!", 3);

        int favNum = 7;
        
        int doubledInt = doubleIt(favNum);

        System.out.println("Doubled is: " + doubledInt);
    }

    // user define static methods go here - after the main
    public static void sayHello()
       {
        System.out.println("Hello!");
       }
    public static void sayHello(int times)
    {
        for(int i = 0; i <= times; i++)
        System.out.println("Hello!");
    }
    public static void sayMsg(String msg, int times)
    {
        for(int i = 0; i <= times; i++)
            System.out.println("msg");
    }
    public static int doubleIt(int num)
    {
        int retVal = 0;
        retVal = num * 2;

        return retVal;

    }
}