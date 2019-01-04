import java.util.Scanner;
 public class MathOperation{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter first number:");
        int first =sc.nextInt();
        System.out.println("Enter second number:");
        int second =sc.nextInt();
        int sum=first+second;
        int diff=first-second;
        int div=first/second;
        int mul=first*second; 
        int mod=first%second; 
        System.out.println("The sum is"+sum); 
        System.out.println("The diff is"+diff); 
        System.out.println("The div is"+div); 
        System.out.println("The mul is"+mul);
         System.out.println("The mod is"+mod);
}
}