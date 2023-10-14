public class Mathh {
    private int numerator;
    private int denominator;

    public Mathh(int numerator,int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

   public static int GCD(int numerator,int denominator){//НСД
       if(denominator ==0){
           return numerator;
       } else {
           return GCD(denominator, numerator % denominator);
       }
   }

   public static int LCM(int numerator,int denominator){//НСК
       if (numerator == 0 || denominator == 0) {
           return 0;
       } else {
           return (numerator * denominator) / GCD(numerator, denominator);
       }
   }

}
