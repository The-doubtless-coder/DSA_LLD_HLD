package org.phonedir.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PermMIssingElementSolution {

    public static void main(String[] args) {
        PermMIssingElement element = new PermMIssingElement();
        int missingElement = element.fetchPermMissingElement(new int[]{2, 1, 4, 3, 5, 7});
        System.out.println("Missing element is " + missingElement);
    }
}


class PermMIssingElement {
    HashSet<Integer> aList = new HashSet<Integer>();//search by 0(1)//ArrayList uses 0(n)
    int fetchPermMissingElement(int[] numArray){
        for(int i = 1; i < numArray.length + 1; i++){//fill the list with all values
            aList.add(i);
        }

        for(int num : numArray){//remove values that array has
            if(aList.contains(num)){
                aList.remove(new Integer(num));
            }
        }
        return aList.iterator().next();//return remaining value that's not in array
    }
}
