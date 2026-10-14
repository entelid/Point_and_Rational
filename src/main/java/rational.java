public class rational {
    private int num;
    private int den;

    public rational(int aNum, int aDen){
        this.num = aNum;
        this.den = aDen;
        if(this.den==0)
            System.out.println("denominator cannot be 0!"); //exception for 0 as den
    }

    /*public double add(rational aRat){ //only one arg as an object will call fun
        return new rational();
    }

    public double subtract(rational aRat){
        //find gcd and add then simplify
    }

    public double multiply(rational aRat){
        //find gcd and add then simplify
    }

    public double divide(rational aRat){
        //find gcd and add then simplify
    }*/


}
