package dev.nacho;
import java.util.ArrayList;
import java.util.List;

public class MultiplicationTable {
    public static List<Integer> multiply(int n) {

        List<Integer> multiples = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            multiples.add(result);
            System.out.println(n + " x " + i + " = " + result);
            
        }
        return multiples;
    }
}
