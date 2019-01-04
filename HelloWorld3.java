
class HelloWorld3{
   public void int printMessage(String message){
       int lengthOfMessage=message.lengthOfMessage();
       return lengthOfMessage;
   }
    public static void main(String...args){
        HelloWorld3 hw= new HelloWorld3();
       int messageLength= hw.printMessage("My custom Message");
       System.out.println("The message length is :"+messageLength);
    }

}