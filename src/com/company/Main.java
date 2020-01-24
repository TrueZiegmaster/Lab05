package com.company;

import lab05_tasks.*;

public class Main {

    public static void main(String[] args) {
        //region TASK_1
        Symbol symbol = new Symbol();
        symbol.set('A');
        System.out.println("Got symbol code: " + symbol.get());
        symbol.print();
        //endregion

        //region TASK_2
        SymbolList slc = new SymbolList();
        slc.get();
        //endregion

        //region TASK_3
        Digits digits = new Digits();
        System.out.printf("\n%d %d\n", digits.A, digits.B);
        digits = new Digits(5);
        System.out.printf("%d %d\n", digits.A, digits.B);
        digits = new Digits(5, 10);
        System.out.printf("%d %d\n", digits.A, digits.B);
        //endregion

        //region TASK_4
        Useless useless = new Useless(8, 9);
        useless.print();
        useless = new Useless(65.1267);
        useless.print();
        //endregion

        //region TASK_5
        CustomInt customInt = new CustomInt();
        System.out.println(customInt.get());
        customInt = new CustomInt(67);
        System.out.println(customInt.get());
        customInt.set();
        System.out.println(customInt.get());
        customInt.set(101);
        System.out.println(customInt.get());
        //endregion

        //region TASK_6
        MinMax minMax = new MinMax(50, 10);
        minMax.print();
        minMax.set(5);
        minMax.set(100);
        minMax.print();
        //endregion
    }
}
