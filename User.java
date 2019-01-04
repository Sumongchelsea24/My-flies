import java.util.Scanner;
class User {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int input=sc.nextInt();
    while(input==0){
    System.out.println("Hello World");
    System.out.println("Do you want to repeat");
    input=sc.nextInt();}
}
}