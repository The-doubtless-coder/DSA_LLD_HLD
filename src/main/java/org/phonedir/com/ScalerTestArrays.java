package org.phonedir.com;

import lombok.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;

public class ScalerTestArrays {


    public static void main(String[] args) {
        sortArraysInterface();
        sortStringArrays();
        sortComplexType();
        customComparator();



    }

    private static void sortArraysInterface(){
        int[] unsortedArray = new int[]{7, 3, 6, 1, 2, 9, 11, 34, 2, 0, 5};
        Arrays.sort(unsortedArray);
        System.out.println("integer sorted array: " + Arrays.toString(unsortedArray));
    }

    private static void sortStringArrays(){
        String[] unsortedStringArray = new String[]{
                "maize", "beans", "honey", "heineken", "beer", "jewelery",
                "barley", "jeans", "apple", "mango"
        };
        Arrays.sort(unsortedStringArray);
        System.out.println("sorted in ascending order: " + Arrays.toString(unsortedStringArray));

        Arrays.sort(unsortedStringArray, Collections.reverseOrder());
        System.out.println("sorted in descending order: " + Arrays.toString(unsortedStringArray));
    }

    private static void sortComplexType(){
        Employee[] employees = new Employee[6];
        employees[0] = new Employee("IAN", 21, 10500);
        employees[1] = new Employee("Victor", 24, 12500);
        employees[2] = new Employee("JEFF", 32, 11600);
        employees[3] = new Employee("CAMEROON", 27, 62000);
        employees[4] = new Employee("MICROSOFT", 28, 12500);
        employees[5] = new Employee("KENITO", 21, 11000);

        Arrays.sort(employees);
        System.out.println("sorted employees by what? " + Arrays.toString(employees));

    }

    private static void customComparator(){
        Integer[] nums = new Integer[]{32, 64, 19, 11, 7, 3, 4, 1, 77, 45, 31};
        Arrays.sort(nums, new Comparator<Integer>(){
            @Override
            public int compare(Integer integer, Integer t1) {
                return integerSum(integer) - integerSum(t1);
            }
        });
        System.out.println("sort by integer sum : " + Arrays.toString(nums));
    }

    private static int integerSum(int x){
        int sum = 0;
        while(x>0){
            sum = sum + x % 10;
            x = x / 10;
        }
        return sum;
    }

}

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
class Employee implements Comparable<Employee>{
    private String name;
    private int age;
    private double salary;

    @Override
    public int compareTo(Employee employee) {
        int returnVal = 0;
//        if(this.age == employee.getAge()){
//            return (int)(this.salary - employee.getSalary());
//        }
//        if(this.age > employee.age){
//            returnVal = 1;
//        }else if(this.age < employee.age){
//            returnVal = -1;
//        }
//        if(returnVal == 0){//means age is same
//            return (int)(this.salary - employee.salary);
//        }
//        return 0;
        if(this.age == employee.getAge()){
            return (int)(this.salary - employee.salary);
        }
        return this.age - employee.age;
    }
}
