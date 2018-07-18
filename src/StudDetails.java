import java.util.Scanner;

public class StudDetails {

//    public static void main(String[] args) {
//
//        int nos;
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number of students: ");
//        nos=in.nextInt();
//        int[] grades = new int[nos];
//        System.out.println("You can only enter between 0-100 !");
//        for(int i = 0;i < nos; i++){
//            System.out.println("Enter the grade for student "+(i+1));
//            grades[i] = in.nextInt();
//        }
//
//        StudDetails obj = new StudDetails();
//
//        System.out.println("Average marks are: "+obj.avg(nos,grades));
//        System.out.println("Minimum marks are: "+obj.min(nos,grades));
//        System.out.println("Maximum marks are: "+obj.max(nos,grades));
//    }



    public double avg(int num, int[] arr) {
        float sum = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i]>100 || arr.length>num)
                return 0;

            sum+=arr[i];
        }
        return sum/arr.length;
    }

    public int min(int num, int[] arr)
    {
        int min = arr[0];
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]>100 || arr.length>num)
                return 0;

            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }

    public int max(int num, int[] arr)
    {
        int max = arr[0];
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]>100 || arr.length>num)
                return 0;

            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
}
