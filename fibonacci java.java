import java.util.Scanner;
class fib{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("....................................");
System.out.println("enter the number of items you want");
int n=sc.nextInt();
int a=0,b=1,c;
int i=0;
System.out.println("the fibonacci series is");
while(i<n){
System.out.print(a+"");
c=a+b;
a=b;
i++;
}
System.out.println("\n............................");
}}
