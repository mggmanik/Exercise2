public class Factorial {
//    public static void main(String[] args)
//    {
//        Factorial obj = new Factorial();
//
//        System.out.println("Integer factorials:");
//        obj.intFactorials(1,1);
//
//        System.out.println("Long Integer factorials:");
//        obj.longFactorials(1L,1L);
//    }

    public int intFactorials(int i, int f)
    {
        int x;
        while (true)
        {
            System.out.println("The factorial of "+i+" is: "+f);
            if (Integer.MAX_VALUE / f < (i+1)) {

                System.out.println("The factorial of "+(i+1)+" is out of range.");
                break;
            }
            i++;
            f *= i;
        }
//        if (x==0)
//            return i+1;

        return f;
    }

    public long longFactorials(long i, long f)
    {
        long x;
        while (true)
        {
            System.out.println("The factorial of "+i+" is: "+f);
            if (Long.MAX_VALUE / f < (i+1)) {
                System.out.println("The factorial of "+(i+1)+" is out of range.");
                break;
            }
            i++;
            f *= i;
        }
//        if (x==0)
//            return i+1;

        return f;
    }
}
