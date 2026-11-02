import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your name");
        String name=input.nextLine();
        
        System.out.print("Enter mark 1: ");
        int mark1 = input.nextInt();

        System.out.print("Enter mark 2: ");
        int mark2 = input.nextInt();

        System.out.print("Enter mark 3: ");
        int mark3 = input.nextInt();

        int total=mark1+mark2+mark3;
        double average=total/3.0;

        System.out.println("Student:"+name);
        System.out.println("Total:"+total);
        System.out.println("Average:"+average);

        if(average>=40){
            System.out.println("Result = Pass");
        }else{
            System.out.println("Result = Fail");
        }
    }
}