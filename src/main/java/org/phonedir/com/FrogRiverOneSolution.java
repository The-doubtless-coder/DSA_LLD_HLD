package org.phonedir.com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;

public class FrogRiverOneSolution {

    private HashSet<Integer> possiblePositions = new HashSet<Integer>();

    public static void main(String[] args) {
        FrogRiverOneSolution solution = new FrogRiverOneSolution();
        int pos = solution.canFrogJump(new int[]{1, 3, 1, 4, 3, 5, 4, 2}, 5);
        if(pos == -1) {
            System.out.println("Can't jump " + pos);
        }else System.out.println("Jump at pos " + pos);
    }

    public int canFrogJump(int[] numArrays, int endPosition) {
//        int numOfLeavesToFAll = numArrays.length;
        for (int i = 1; i <= endPosition; i++) {//unique values that must be there for frog to jump
            possiblePositions.add(i);
        }
//        System.out.println(possiblePositions);
        for (int j = 0; j < numArrays.length; j++) {
            if (possiblePositions.remove(new Integer(numArrays[j]))) {
                if(possiblePositions.isEmpty()){
                    return j;
                }
            }
        }
        return -1;
    }
}
