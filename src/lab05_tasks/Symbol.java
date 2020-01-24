package lab05_tasks;

public class Symbol {
    private char symbol;
    public void set(char input){
        symbol = input;
    }
    public int get(){
        return symbol;
    }
    public void print(){
        System.out.println(symbol + " " + (int)symbol);
    }
}
