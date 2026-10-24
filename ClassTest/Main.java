
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    static void missingNumber(int[] arr) {
        int max = arr.length;
        int sum = 0;
        int finalSum;
        int missingNumber;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        finalSum = max * (max + 1) / 2;

        missingNumber = finalSum - sum;
        System.out.println(missingNumber);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];

            if (map.containsKey(needed)) {
                return new int[]{map.get(needed), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }

    static int SecondHigh(int[] arr) {
        int max = arr[0];
        int secmax = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secmax = max;
                max = arr[i];
            } else if (arr[i] < max && arr[i] > secmax) {
                secmax = arr[i];
            }
        }
        return (secmax == Integer.MIN_VALUE) ? -1 : secmax;
    }

    static int uniqueLetter(String name) {
        for (int i = 0; i < name.length(); i++) {
            char checker = name.charAt(i);
            boolean isRepeated = false;
            for (int j = 0; j < name.length(); j++) {

                if (i != j && checker == name.charAt(j)) {
                    isRepeated = true;
                    break;
                }
            }

            if (isRepeated == false) {
                return i;
            }
        }
        return -1;
    }

    static Boolean repeatRoll(int[] arr) {
        Boolean twice = false;

        for (int i = 0; i < arr.length; i++) {
            int arrEle = arr[i];

            for (int j = 0; j < arr.length; j++) {
                if (i != j && arrEle == arr[j]) {
                    twice = true;
                    break;
                }

            }
            if (twice) {
                break;
            }
        }
        if (twice == true) {
            return true;
        }
        return false;

    }

    public static int maxProfit(int[] prices) {

        if (prices == null || prices.length < 2) {
            return 0;
        }

        int minPrice = prices[0];

        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {

                int currentProfit = prices[i] - minPrice;

                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit;
                }
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 3};
        missingNumber(nums);

        int[] nums2 = {2, 7, 11, 15};
        int[] result = twoSum(nums2, 9);

        
        System.out.println(Arrays.toString(result));


        System.out.println(SecondHigh(nums));

        String name = "loveleetcode";
        System.out.println(uniqueLetter(name));

        int[] roll = {1, 2, 3, 4,};
        System.out.println(repeatRoll(roll));


        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices1));
    }
}
