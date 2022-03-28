package HW1;

public class Calculator {
    private int x;
    private int y;

    public Calculator(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int add(){
        return this.x + this.y;
    }

    public int subtract(){
        return this.x-this.y;
    }
    public int multiply(){
        return this.x*this.y;
    }
    public double divide(){
        return Math.floorDiv(this.x,this.y);
    }
    public int square(){
        return this.x*this.x;
    }
    public double squareRoot(){
        return Math.sqrt(this.x);
    }
    public double exponents(){
        return Math.pow(this.x,this.y);
    }
}
