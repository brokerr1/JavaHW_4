package Java.HomeWork.JavaHW_4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.logging.Logger;

public class task1 {

    //Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся в обратном порядке,
    // и каждый из их узлов содержит одну цифру.
    // Сложите два числа и верните сумму в виде связанного списка.
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,2,3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,4,7));
        // result [1,0,6,6]
        task1 task1 = new task1();
        Logger log = Logger.getLogger(task1.class.getName());
        log.info(String.valueOf(task1.sum(d1, d2)));
    }
//321
//745
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