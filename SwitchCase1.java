class SwitchCase1{
    public static void main(Sting[]args){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        switch(a%2)
        {
            case1:
            System.out.println(" Even number");
            break;
            case2:
            System.out.println(" Odd number");
            default:
            System.out.println("Not on our list");
        }
    }
}