package main;

import java.util.Arrays;

public class A80 {

    public static int removeDuplicates(int[] nums) {
        int length = nums.length;
        //当长度小于等于2时，无需做任何操作
        if (length <= 2) {
            return length;
        }
        int i = 2;
        int j = 2;
        while (j < length) {
            if(nums[i-2] != nums[j]){
                nums[i] = nums[j];
                ++i;
            }
            ++j;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] list = {1,1,1,2,2,3};
        int length = removeDuplicates(list);
        System.out.println(length);
        System.out.println(Arrays.toString(list));
    }
}
