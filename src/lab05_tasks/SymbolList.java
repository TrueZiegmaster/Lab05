package lab05_tasks;

public class SymbolList {
    private char charA = 'A';
    private char charB = 'D';

    public void get(){
        for(int i = charA; i < charB + 1; i++){
            System.out.print((char)i + " ");
        }
    }
}
