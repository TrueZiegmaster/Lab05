package lab05_tasks;

public class Useless {
    private char symbol;
    private int digit;

    public Useless(int charInt, int x){
        symbol = (char) charInt;
        digit = x;
    }

    public Useless(double y){
        symbol = (char) y;
        y -= (int)y;
        do{
            y*=10;
        }while (y <= 10);
        digit = (int)y;
    }

    public void print(){
        System.out.printf("%d %d\n", (int)symbol, digit);
    }
}
