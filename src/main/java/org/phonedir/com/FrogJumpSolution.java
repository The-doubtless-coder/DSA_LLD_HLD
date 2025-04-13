package org.phonedir.com;

public class FrogJumpSolution {
    public static void main(String[] args) {
        FrogJump jump = new FrogJump();
        int steps = jump.steps(10, 30, 10);
        if(steps == -1){
            System.out.println("destination cannot be less than start point");
        }else System.out.println("Min steps to jump is: "  + steps);
    }

}

class FrogJump{
    int steps(int startPoint, int fixedJumpDistance, int endPoint){
        if(endPoint < startPoint){//corner case
           return -1;
        }

        if(startPoint == endPoint){//corner cases
            return 0;
        }
        int distanceDiff = Math.abs(endPoint - startPoint);
        double v = (double) distanceDiff / fixedJumpDistance;
        System.out.println("double value is " + v);
        return  (int) Math.ceil((double) distanceDiff / fixedJumpDistance);
    }
}
