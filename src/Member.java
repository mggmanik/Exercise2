import java.util.Scanner;

public class Member {

    public String name;
    public int age;
    public double salary;
}

class MemberVariable{

    Member obj = new Member();

    public MemberVariable(String name, int age, double salary)
    {
        obj.name = name;
        obj.age = age;
        obj.salary = salary;
    }

    public String memberDetails()
    {
        System.out.println("Member's Name: "+obj.name);
        System.out.println("Member's Age: "+obj.age);
        System.out.println("Member's Salary: "+obj.salary);

        StringBuilder sb = new StringBuilder();
        sb.append(obj.name+" "+obj.age+" "+obj.salary);

        return sb.toString();
    }


//    public static void main(String[] args) {
//
//        String name;
//        int age;
//        double salary;
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter Name: ");
//        name = in.nextLine();
//        System.out.println("Enter age: ");
//        age =  in.nextInt();
//        System.out.println("Enter Salary: ");
//        salary = in.nextDouble();
//
//        MemberVariable obj1 = new MemberVariable(name,age,salary);
//        obj1.memberDetails();
//    }
}
