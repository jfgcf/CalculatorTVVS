public abstract class Calculator {

    double a;
    double b;
    double result;

    public abstract double calculate();
    public abstract void Print();


    public static void main(String[] args) {

        //addition has to return 3
        Addition a = new Addition(1,2);
        a.Print();

        //subtraction has to return -1
        Subtraction s = new Subtraction(1,2);
        s.Print();

        //multiplication has to return 1024
        Multiplication m = new Multiplication(256,4);
        m.Print();
    }

}

