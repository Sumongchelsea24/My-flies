/*Check wheather a number is palindrome*/
class Palindrome{
    public static void main(String[]args){
        int num =121;
        int temp=num;
        int rev=0,rem;
        while(temp!=10){
            rem= temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(num==rev){
            System.out.println("is palindrome number"+num);}
            else {
                
                System.out.println("is not a palindrome number"+num);
            }
        
    }
}