package org.phonedir.com;

public class TapeEquilibriumSolution {

    int soluton(int[] numArray){
        int numOnRight = 0;
        for(int i = 0; i < numArray.length; i++){
            numOnRight += numArray[i];
        }

        int minDiff = Integer.MAX_VALUE;
        int numOnLeft = 0;
        for(int i = 0;  i < numArray.length - 1; i++){
            numOnRight -= numArray[i];
            numOnLeft += numArray[i];
//            if(i>0){
                if(Math.abs(numOnRight - numOnLeft)< minDiff){
                    minDiff = Math.abs(numOnRight - numOnLeft);
//                }
            }
        }
        return minDiff;
    }

    public static void main(String[] args) {
        System.out.println("Min difference is " + new TapeEquilibriumSolution().soluton(
                new int[]{1000, -1000}
        ));
    }
}
