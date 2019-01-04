/*do while loop*/
import java.util.Scanner;
class OddEven1{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        String a=null;
        do{
        System.out.println("Enter the number");
        int a=sc.nextInt();
        System.out.println(a%2==0?"even":"odd");
        System.out.println("Do you wish to continue?");
        result=sc.next();
}
while(result.equals("yes"));
    }
}