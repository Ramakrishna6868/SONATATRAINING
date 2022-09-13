package javaindebuggingmode;

public class DecimalToOctalApproach2
{
    static void decimaltooctal(int deciNum)
    {
       int octalNum=0,countval=1;
       int dNo=deciNum;
       while (deciNum != 0)
       {
           int remainder = deciNum % 8;
           octalNum += remainder * countval;
           countval = countval * 10;
           deciNum /= 8;
       }
       System.out.println(octalNum);
   }
   public static void main(String[] args)
   {
       
       int n = 33;

       
       decimaltooctal(n);
   }
}


