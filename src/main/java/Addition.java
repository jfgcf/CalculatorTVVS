public class Addition extends Calculator{

    public Addition(int op1, int op2){

        this.a=op1;
        this.b=op2;

    }

    @Override
    public int calculate() {
        result = a+b;
        return result*2;

    }

    public void Print(){
        calculate();
        System.out.println(result);
    }

}
