import java.util.Scanner;
class Name{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a name");
        
        String name = sc.nextLine();
        System.out.println("Enter a address");
        String address = sc.nextLine();
        System.out.println(name);
System.out.println(address);
    }
}