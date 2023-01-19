import java.util.Random;

public class DecimalCounter {

    private int[] counter;
    private int range;
    private int currentState;

    public DecimalCounter(){
        int firstValue;
        int lastValue;
        int size;
        Random rand = new Random();
        size =rand.nextInt(20);

        if(size <= 3){
            while(size <= 3){
                size =rand.nextInt(20);
            }
        }

        lastValue = rand.nextInt(50);
        firstValue = lastValue - size + 1;

        this.counter = new int[size];
        this.range = size;
        this.currentState = firstValue;
        int temp = firstValue;
        for(int i = 0; i < size; i++){
            this.counter[i] = temp;
            temp++;
        }
    }

    public DecimalCounter(int firstValue, int lastValue){

        int size = lastValue - firstValue + 1;
        if(size >= 3) {
            this.counter = new int[size];
            this.range = size;
            this.currentState = firstValue;
            int temp = firstValue;
            for (int i = 0; i < size; i++) {
                this.counter[i] = temp;
                temp++;
            }
        } else{
            System.out.println("Error, impossible range");
        }
    }

    public int[] getCounter() {
        return counter;
    }

    public int getRange() {
        return range;
    }

    public int getCurrentState() {
        return currentState;
    }

    public void showValues(){
        System.out.println("Decimal Counter values:");
        for(int i = 0; i < getRange(); i++){
            System.out.print(getCounter()[i] + " ");
        }
        System.out.println();
    }

    public void showCurrentState(){
        System.out.println("Current State: " + getCurrentState());
    }

    public void moveForward(){
        if(currentState == getCounter()[getRange()-1]){
            System.out.println("Impossible to move forward");
        } else{
            this.currentState ++;
        }
    }

    public void moveBack(){
        if(currentState ==  getCounter()[0]){
            System.out.println("Impossible to move forward");
        } else{
            this.currentState --;
        }
    }
}
