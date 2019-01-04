/*find whether anumber is prime or not"optimize"*/
class PrimeExa{
    public static void main(String[]args){
        int n=13;
        int flag=0;
        if (n%2!=0)
        for(int i=2;i<=n;i++)
        {
            if(n%i==0){
                flag=1;
            }
        }
        if (flag==1){
            System.out.println("prime");
        }
        else{
            System.out.println("Not prime");
        }
        else{
            System.out.println("Not prime");
        }
    }
}