package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class JavaStack {

    public static void main(String args[]){
        Stack<Integer> intStack = new Stack();
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        intStack.addAll(list);

        intStack.stream().map(p->p.intValue()).forEach(System.out::println);
    }
}
