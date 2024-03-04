package Arrays;

import org.apache.commons.collections.functors.PredicateTransformer;

public class sum2 {
    public static void main(String[] args) {
        sum2 s = new sum2();
        int[] aa = {2, 5, 5};
        System.out.println(s.has23(aa));
    }


    public int sum(int[] nums) {
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];
        return nums[0] + nums[1];
    }


    public int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }

    public int[] makeEnds(int[] nums) {
        return new int[]{nums[0], nums[nums.length - 1]};
    }

    public boolean has23(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 || nums[i] == 3)
                return false;

        }
        return true;
    }

    public int[] makeLast(int[] nums) {
        int[] arr = new int[2 * nums.length];
        arr[arr.length - 1] = nums[nums.length - 1];
        return arr;
    }

    public boolean double23(int[] nums) {
        if (nums.length == 1)
            return false;

        return true;
    }

}
