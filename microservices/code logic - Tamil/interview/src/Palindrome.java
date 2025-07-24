import java.util.ArrayList;

public class Palindrome {
    public static void main(String[] args) {
//        String str = "abca";
//        String arr = new String(4);
//        for (int i = 0; i < str.length(); i++) {
//            arr.add(str.charAt(i));
//            for (int j = 0; j < str.length(); j++) {
//
//            }
//        }

//        int[] nums = {2, 7, 11, 15};
//        int target = 13;
//
//        for (int i = 0; i < nums.length; i++) {
//            int result = 0;
//            for (int j = 0; j < nums.length; j++) {
//                if(i != j) {
//                    result = add(nums[i], nums[j]);
//                    if(result == target) {
//                        System.out.println("Array index: " + "[" + i + ", " + j + "]");
//                    }
//                }
//            }
//        }

        int[] temperatures = {73,74,75,71,69,72,76,73};
//        Output: [1,1,4,2,1,1,0,0]

        ArrayList<Integer> op = new ArrayList(temperatures.length);
        int counter = 0;
        for (int i = 0; i < temperatures.length; i++) {
            for (int j = 0; j < temperatures.length; j++) {
                if (i != j) {
                    boolean isHigherTemperature = checkHigherTemperature(temperatures[i], temperatures[j]);
                    if (isHigherTemperature) {
                        int indexOfDays = ++counter;
                        op.add(indexOfDays);
                        counter = 0;
                        break;
                    }
                }
            }
        }
        System.out.println("Output : " + op);

    }

//    public static int add(int a, int b) {
//        return a + b;
//    }

    public static boolean checkHigherTemperature(int a, int b) {
        return b > a;
    }
}



// Practise
//Bharathi Kanna
//9:46 AM
//Given a string s, return true if the s can be palindrome after deleting at most one character from it.
//
//
//
//        Example 1:
//
//Input: s = "aba"
//Output: true
//Example 2:
//
//Input: s = "abca"
//Output: true
//Explanation: You could delete the character 'c'.
//Example 3:
//
//Input: s = "abc"
//Output: false
//Bharathi Kanna
//9:57 AM
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.
//
//
//
//        Example 1:
//
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//Example 2:
//
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//Bharathi Kanna
//10:18 AM
//Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.
//
//
//
//        Example 1:
//
//Input: temperatures = [73,74,75,71,69,72,76,73]
//Output: [1,1,4,2,1,1,0,0]
//Example 2:
//
//Input: temperatures = [30,40,50,60]
//Output: [1,1,1,0]
//Example 3:
//
//Input: temperatures = [30,60,90]
//Output: [1,1,0]