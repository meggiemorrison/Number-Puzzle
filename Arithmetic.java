/**
 * This class holds the two methods 
 * for calculating numbers:
 * Normal, and Left to Right
 * 
 * @author Meggie Morrison
 */

import java.util.*;

public class Arithmetic {


   public static String leftToRight(List<Integer> nums, String ops, int target) {  
       int total = nums.get(0);
       Boolean failed = null;
       //System.out.println("Ops: length " + ops.length() + "\nOps----> : " + ops);
       for (int i = 0; i < ops.length(); i++) {
           if (ops.length() > 0 && ops.charAt(i) == '+') {
               total += nums.get(i+1);
               System.out.println("+total : " + total);
               //System.out.println("+++++++!");
           } else {
               total *= nums.get(i+1);
               System.out.println("*total : " + total);
               //System.out.println("*******");
           }     
       }

       System.out.println("Ops length: " + ops.length());
       if (ops.length() == nums.size()-1){
           if (total == target){
               failed = false;
               return ops;
           } else {
               failed = true;
           }
       }


       if (failed) {
           System.out.println("failed");
           ops = ops.substring(1);
           leftToRight(nums, (ops + "*"), target);
       } else if (failed == false) {
           System.out.println("passed");
           ops = ops.substring(1);
           leftToRight(nums, (ops + "+"), target);
       } else {
           leftToRight(nums, ops + "+", target);
       }
       
       return("Impossible");

   }

}