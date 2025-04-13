package org.phonedir.com;

public class SolutionBinaryGap {

    public static void main(String[] args) {
        int solution = solution(561892);
        System.out.println("Binary Gap: " + solution);
    }

    public static int solution(int i){
        int maxGap = 0;
        int currentGap = 0;
        String binaryRepresentation = Integer.toBinaryString(i);
        System.out.println("binaryRepresentation: " + binaryRepresentation);
        for(int j = 0;  j < binaryRepresentation.length(); j++){
            if(binaryRepresentation.charAt(j) == '1'){//either at the beginning or ending of a gap
                if(currentGap > maxGap){
                    maxGap = currentGap;
                }
                currentGap = 0;
            }else{//binary is 0//still in the gap
                currentGap++;
            }
        }
        return maxGap;
    }
}
