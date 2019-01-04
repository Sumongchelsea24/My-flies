
      class ExamPercentage{
    public static void main(String[]args){
        int per = Integer.parseInt(args[0]);   

        if(per>=80)
              {
            System.out.println("Distinction"+per);
 }
    else if((per>=60)&&(per<80))
    {
            System.out.println("first division"+per);
        }
        else if((per>=50)&&(per<60))
        {
            System.out.printf("second division"+per);
        }
        else if((per>=40)&&(per<50)){
            System.out.println("third division"+per);
        }
        else{
            System.out.println("fail"+per);
        }
    }}