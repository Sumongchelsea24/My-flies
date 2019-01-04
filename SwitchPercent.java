 class SwitchPercent{
    public static void main(String[]args){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int percent=sc.nextInt();
        switch(percent/10)
        {
            case 10:
            case 9:
            case 8:
            System.out.println("distinction");
            break;
            case 7:
            case 6:
            System.out.println("first division");
            break;
            case 5:
            System.out.println(" Second division");
            break;
            case 4:
            System.out.println("Third division");
            break;
            case 3:
            case 2:
            case 1:
            case 0:
            System.out.println("fail");
            break;
            default:
            System.out.println("Not on our list");
        }
    }
}