package Functions;

import java.util.Scanner;

public class example {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printMyName(name);
        
}
}
