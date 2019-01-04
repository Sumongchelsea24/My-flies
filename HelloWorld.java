class HelloWorld{
   static int b=20;//b isdeclared inside so it is global varible
    public static void main(String...args){
        int a=10;// a is declared inside main method so its scope is local
        System.out.println(a);
        System.out.println(b);
    }

}