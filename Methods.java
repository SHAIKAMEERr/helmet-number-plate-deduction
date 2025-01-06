import java.util.Scanner;
class Methods
{
    static int avg(int a,int b,int c)
    {
        int average=(a+b+c)/2;
        return(average);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of A : ");
        int a=sc.nextInt();
        System.out.print("Enter value of B : ");
        int b=sc.nextInt();
        System.out.print("Enter value of C : ");
        int c=sc.nextInt();
        int x=avg(a,b,c);
        System.out.println("Average of "+a+" "+b+" "+c +" = "+x);

    }
}