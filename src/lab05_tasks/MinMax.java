package lab05_tasks;

public class MinMax {
    private int min = 100;
    private int max = 0;

    public MinMax(int z){
        set(z);
    }

    public MinMax(int x, int y){
        set(x, y);
    }

    public void set(int z){
        if(z > max)
            max = z;
        else if (z < min)
            min = z;
    }

    public void set(int x, int y){
        if (x > y){
            if (x > max)
                max = x;
            if (y < min)
                min = y;
        }
        else{
            if (y > max)
                max = y;
            if (x < min)
                min = x;
        }
    }

    public void print(){
        System.out.printf("Min: %d\nMax: %d\n", min, max);
    }
}
