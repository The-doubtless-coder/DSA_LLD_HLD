package org.phonedir.com;

import java.util.ArrayList;
import java.util.List;

public class OddOccurencesSolution{
    public static void main(String[] args) {
        OddOccurenceClass oddOccurenceClass = new OddOccurenceClass();
        Integer solution = oddOccurenceClass.solution(new int[]{2, 2, 3, 3, 7, 7,9});
        System.out.println("Value with odd occurence is " + solution);
    }
}

class OddOccurenceClass {//package private
    public List<Integer> aList = new ArrayList<>();
    Integer solution(int[] array) {
        for(int i = 0; i <array.length; i++) {
            int searchElement = array[i];
            if(aList.contains(searchElement)){
                aList.remove(new Integer(searchElement));
            }else {
                aList.add(searchElement);
            }
        }
        return aList.get(0);
    }
}
