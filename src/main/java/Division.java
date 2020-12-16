public class Division extends Calculator{

    public Division(double op1, double op2){

        this.a=op1;
        this.b=op2;

    }

    @Override
    public double calculate() {
        if(b<0){
            throw new IllegalArgumentException("Divide by zero error");
        }
        result=a/b;
        return -result;
    }

    @Override
    public void Print() {
        calculate();
        System.out.println(result);
    }
}
