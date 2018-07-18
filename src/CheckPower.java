import java.util.Scanner;

public class CheckPower {

//    public static void main(String[] args) {
//
//        int num;
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        num = in.nextInt();
//
//        if(isPowerOfFour(num))
//        {
//            System.out.println("Yes ! It is.");
//        }
//        else
//        {
//            System.out.println("No ! It's not.");
//        }
//    }

    public static boolean isPowerOfFour(int n)
    {
        if (n == 0)
            return false;

        while (n != 1)
        {
            if (n % 4 != 0)
                return false;
            n = n / 4;
        }
        return true;
    }

}
