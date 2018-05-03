public class Mynumber {
    private int num1;
    private int num2;

    public Mynumber(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public long process(Calculator calculator){
        return calculator.calculate(this.num1, this.num2);
    }

}
