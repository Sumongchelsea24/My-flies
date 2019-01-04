import java.util.Scanner;
class TestDynamic {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER THE NUMBER");
    int input=sc.nextInt();
    while(input==0){
    System.out.println("Hello World");
    System.out.println("Do you want to repeat");
    input=sc.nextInt();}
}
}