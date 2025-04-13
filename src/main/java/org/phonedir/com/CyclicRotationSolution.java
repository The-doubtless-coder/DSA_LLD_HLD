package org.phonedir.com;

import java.util.Arrays;
import java.util.List;

public class CyclicRotationSolution {

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4};
        System.out.println(Arrays.toString(solution(intArray, 4)));
    }

    public static int[] solution(int[] numArray, int iterations) {
        for(int i = 0; i<iterations; i++) {
            int lastElement = numArray[numArray.length - 1];
            for(int j = numArray.length - 2; j>=0; j--) {
                numArray[j+1] = numArray[j];
            }
            numArray[0] = lastElement;
        }
        return numArray;
    }
}
