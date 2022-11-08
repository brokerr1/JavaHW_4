package Java.HomeWork.JavaHW_4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
//import java.util.logging.Logger;

public class homework {

    //Даны два Deque представляющие два целых числа. Цифры хранятся в обратном порядке,
    // и каждый из их узлов содержит одну цифру.
    public static void main(String[] args) {
        homework hw = new homework();
        Deque<Integer> res1 = hw.multiple(new ArrayDeque<>(Arrays.asList(5,2)), new ArrayDeque<>(Arrays.asList(4)));
        // result [0,0,1]
        System.out.println("Произведение чисел:");
        System.out.println(res1);
        Deque<Integer> res2 = hw.sum(new ArrayDeque<>(Arrays.asList(-5,-2)), new ArrayDeque<>(Arrays.asList(5)));
        // result [0,-2]
        System.out.println("Сумма чисел:");
        System.out.println(res2);
    }

    // Умножьте два числа и верните произведение в виде связанного списка.
    public Deque<Integer> multiple(Deque<Integer> d1, Deque<Integer> d2){
        LinkedList<Integer> sum = new LinkedList<>();
        int mul = 0;
        while (d2.size() > 0) {
            while (d1.size() > 0) {
                mul = (d1.pollFirst() * d2.getFirst()) + mul;
                if (mul > 9){
                    sum.add(mul%10);
                    mul = mul / 10;
                }   else{
                    sum.add(mul);
                    mul = 0;
                }
            }
            d2.removeFirst();
        }
        if (mul != 0){
            sum.add(mul);
        }
        return sum;
    }

    // Сложите два числа и верните сумму в виде связанного списка. Одно или два числа должны быть отрицательными
    public Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2){
        LinkedList<Integer> result = new LinkedList<>();
        //int mind = 0;
        int sum = 0;
        while (d1.size() > 0 || d2.size() > 0){
            if (d1.size() > 0){
                sum = sum + d1.pollFirst();
            }
            if (d2.size() > 0){
                sum = sum + d2.pollFirst();
            }
            if (sum > 9){
                result.add(sum % 10);
                sum = 1;
            }   else{
                result.add(sum);
                sum = 0;
            }
        }
        if (sum != 0){
            result.add(sum);
        }
        return result;
    }
}