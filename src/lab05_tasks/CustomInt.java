package lab05_tasks;

public class CustomInt {
    private int A;

    public CustomInt(){
        set();
    }

    public CustomInt(int input){
        set(input);
    }

    public void set(){
        A = 0;
    }

    public void set(int input){
        if (input < 101)
            A = input;
        else
            A = 100;
    }

    public int get(){
        return A;
    }
}
