/**This class demonstrates the use of object and methods inside a class @author Sujan Shrestha*/
class HelloWorld1{
   public void printMessage(){
       System.out.println("Hello i am method");
   }
    public static void main(String...args){
        HelloWorld1 hw= new HelloWorld1();//creataing object of class HelloWorld 
        hw.printMessage();//accessing the global method by object created
    }

}