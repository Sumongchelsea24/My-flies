class DivisionFinder{
    public String DivisionFinder(int per){  

        if(per>=80)
              {
            return "Distinction";
 }
    else if((per>=60)&&(per<80))
    {
            return "first division";
        }
        else if((per>=50)&&(per<60))
        {
            return "second division";
        }
        else if((per>=40)&&(per<50)){
            return "third division";
        }
        else{
            return "fail";
        }
    
    }
public static void main (String...args){
    DivisionFinder hw = new DivisionFinder();
    String per= hw.DivisionFinder(80);
    System.out.println(per);
}
}