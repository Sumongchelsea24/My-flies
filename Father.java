/*public class Father{
    public static void main(String...args){
son s = new son();
System.out.println(s.a);
}}
class son {
    public int a = 10; //private int a=10 is not access where as protected and public is access

}*/
public class father extends son{
    public static void main(String...args){
        son s= new son ();
        int[]a = {1,2,3,4};
        s.printArray(a);
    }
    class Son {
        public void printArray(int[]a){
            for(Integer s:a){
                System.out.println(s);
            }
        }
    }
}