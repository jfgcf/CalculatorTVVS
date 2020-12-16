public abstract class Calculator {

    int a;
    int b;
    int result;

    public abstract int calculate();
    public abstract void Print();


    public static void main(String[] args) {

        //addition has to return 3
        Addition a = new Addition(1,2);
        a.Print();

        //subtraction has to return -1
        Subtraction s = new Subtraction(1,2);
        s.Print();
    }

}

