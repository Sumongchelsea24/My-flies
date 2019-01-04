class SwitchCase{
    public static void main(Sting[]args){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        switch(a)
        {
            case1:
            System.out.println("you pressed one");
            break;
            case2:
            System.out.println("you pressed two");
            default:
            System.out.println("Not on our list");
        }
    }
}