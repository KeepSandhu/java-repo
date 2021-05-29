package org.main;
import org.functions.*;



public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int i = 0;
        i = myFunctions.sumOftwo(3,4);
        System.out.println("Hello, World!- Sum of two number is " + i);
        //Branch Billu 528
        i = myFunctions.sumOftwo(3,4,7);
        System.out.println("Hello, World!- Sum of tree number is " + i);

    }
}
