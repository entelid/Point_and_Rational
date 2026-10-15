public class rational {
    private int num;
    private int den;

    public rational(int aNum, int aDen){
        this.num = aNum;
        this.den = aDen;
        if(this.den==0)
            System.out.println("denominator cannot be 0!"); //exception for 0 as den
    }

    /*public int gcd(a, b){  //c is result of each recursion, pass b as new number being modded by newest c
        int a = this.den;
        int b = this.num;
        int c = b%a;
        if(c!=0)
            gcd(b, c);
        return b; //return what we modded by to get 0
    }*/

   public rational add(rational aRat){ //only one arg as an object will call fun
       return new rational(((this.num*aRat.den)+(aRat.num*this.den)), (this.den*aRat.den));
    } //returns (ad+bc)/bd

    public rational subtract(rational aRat){
        return new rational(((this.num*aRat.den)-(aRat.num*this.den)), (this.den*aRat.den));
    } //returns (ad-bc)/bd

    public rational multiply(rational aRat){
        return new rational((this.num*aRat.num), (this.den*aRat.den));
    } // returns ac/bd

    public rational divide(rational aRat){
        return new rational((this.num*aRat.den), (this.den*aRat.num));
    } // returns ad/bc


    @Override
    public String toString(){
        return "Rational value: " + this.num + "/" + this.den;
    }

}
