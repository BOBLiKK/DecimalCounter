public class Main {
    public static void main(String[] args) {

        DecimalCounter test1 = new DecimalCounter();
        test1.showValues();
        DecimalCounter test2 = new DecimalCounter(4, 10);
        test2.showValues();
        test2.showCurrentState();
        test2.moveForward();
        test2.showCurrentState();
        test2.moveForward();
        test2.showCurrentState();
        test2.moveForward();
        test2.showCurrentState();
        test2.moveBack();
        test2.showCurrentState();
        DecimalCounter test3 = new DecimalCounter(1, 2);
        test3.showValues();
    }
}