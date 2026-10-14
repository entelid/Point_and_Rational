public class point {

    private int num; //x
    private int den; //y

    public point(int aNum, int aDen){
        this.num = aNum;
        this.den = aDen;
    }

    public double distance(){
        return Math.sqrt((Math.pow(this.num,2)+Math.pow(this.den,2))); //sqrt of x^2 + y^2
    }

    /*public boolean compareTo(point aPoint, point bPoint) {
        return 0;
    }*/

    public point yMirror(){ //takes no args because an object is used to call it and this references that objects data
        return new point(-this.num, this.den);
    }

    public point xMirror(){
       return new point(this.num, -this.den);
    }

    @Override
    public String toString(){
        return "Point value: " + this.num + "/" + this.den;
    }

}
