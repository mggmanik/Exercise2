import java.util.Scanner;

public class CheckPalindrome
{
//    public static void main(String[] args) {
//
//
//        String str;
//        @SuppressWarnings("resource")
//		Scanner in = new Scanner(System.in);
//        System.out.println("Enter a String: ");
//        str = in.next();
//
//        if (isNumber(str))
//        {
//            System.out.println("You are checking for a number !");
//            if (checkIfPalindrome(str).equals(str)) {
//                System.out.println(checkIfPalindrome(str)+ " is a palindrome");
//            }
//            else
//                System.out.println(checkIfPalindrome(str)+ " is not a palindrome");
//        }
//        else
//        {
//            System.out.println("You are checking for a String !");
//            if(checkIfPalindrome(str).equals(str)){
//                System.out.println(checkIfPalindrome(str)+ " is a palindrome");
//            }
//            else
//                System.out.println(checkIfPalindrome(str)+ " is not a palindrome");
//        }
//    }
//
    public static boolean isNumber(String str)
    {
        for(int i=0; i<str.length(); i++)
        {
            if(Character.isDigit(str.charAt(i))==false)
                return false;
        }
        return true;
    }

    public String checkIfPalindrome(String str) {

        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        if (isNumber(str)) {
            if (sb.toString().equals(str)) {
                System.out.println(sb.toString() + " is a palindrome");
            } else
                System.out.println(sb.toString() + " is not a palindrome");

            return sb.toString();
        } else {

            if (sb.toString().equals(str)) {
                System.out.println(sb.toString() + " is a palindrome");
            } else
                System.out.println(sb.toString() + " is not a palindrome");

            return sb.toString();
        }
    }
}
