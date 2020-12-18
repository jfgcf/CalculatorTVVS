public class Addition extends Calculator{

    public Addition(double op1, double op2){

        this.a=op1;
        this.b=op2;

    }

    @Override
    public double calculate() {
        result = a+b;
        return result;

    }

    public void Print(){
        double a = calculate();
        System.out.println(a);
    }

}
