class SwitchCaseString{
    public static void main(String[]args){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        
        String input=sc.next();
        switch(input.toLowerCase())
        {
            case "kathmandu":
            System.out.println("captial of Nepal");
            break;
            case "delhi":
            System.out.println("captial of india");
            default:
            System.out.println("Not on our list");
        }
    }
}