class Palindrome1{
    public String palindorme(){
        int num=121,reversedInteger=0,reminder,originalInteger;
        originalInteger= num;
        while(num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num /=10;
        }
        if(originalInteger == reversedInteger)
        return originalInteger + "is a palindrome";
        else
        return originalInteger + "is not a palindrome";}
        public static void main(String[]args){
            Palindrome1 db = new Palindrome1();
            String palindorme = db.palindrome();
            System.out.println(palindorme);
        
    }
}