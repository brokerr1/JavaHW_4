package Java.HomeWork.JavaHW_4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class homework {

    //Даны два Deque представляющие два целых числа. Цифры хранятся в обратном порядке,
    // и каждый из их узлов содержит одну цифру.
    public static void main(String[] args) {
        homework hw = new homework();
        Deque<Integer> res1 = hw.multiple(new ArrayDeque<>(Arrays.asList(5,2)), new ArrayDeque<>(Arrays.asList(4)));
        // result [0,0,1]
        System.out.println(res1);
        Deque<Integer> res2 = hw.sum(new ArrayDeque<>(Arrays.asList(5,-2)), new ArrayDeque<>(Arrays.asList(5)));
        // result [0,-2]
        System.out.println(res2);
    }

    // Умножьте два числа и верните произведение в виде связанного списка.
    public Deque<Integer> multiple(Deque<Integer> d1, Deque<Integer> d2){
        System.out.println(d1);
        System.out.println(d2);
        return new ArrayDeque<>();
    }

    // Сложите два числа и верните сумму в виде связанного списка. Одно или два числа должны быть отрицательными
    public Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2){
        System.out.println(d1);
        System.out.println(d2);
        return new ArrayDeque<>();
    }
}