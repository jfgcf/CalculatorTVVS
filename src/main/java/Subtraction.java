public class Subtraction extends Calculator{

    public Subtraction(int op1, int op2){

        this.a=op1;
        this.b=op2;

    }

    @Override
    public int calculate() {
        result=a+b;
        return result;
    }

    @Override
    public void Print() {
        calculate();
        System.out.println(result);
    }
}
