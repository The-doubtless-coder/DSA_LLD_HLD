package org.phonedir.com;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;



public class ScalerCollections {
    public static void main(String[] args) {
        int[] nums = new int[]{12, 56, 43, 12, 11, 19, 16, 17};
        List<Integer> integerList = arrayToList(nums);
        Iterator<Integer> iterator = integerList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
//         Arrays.asList(nums);
    }

    private static List<Integer> arrayToList(int[] nums){
        List<Integer> integerList = new ArrayList<>();
        for(int num : nums){
            integerList.add(Integer.valueOf(num));//wrapper, converts int to Integer//String.valueOf()
        }
        return integerList;
    }


}
