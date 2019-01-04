class Immutable{
    public static void main(String[]args){
         String s1="Hello World";
         String s2="Hello World";
         String s=new String("Hello World");
         System.out.println(s1==s2);
         System.out.println(s1==s);
         System.out.println(s1.equals(s2));
         System.out.println(s1.equals(s));
    }
}