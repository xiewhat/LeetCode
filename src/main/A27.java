package main;

public class A27 {

    public int removeElement(int[] nums, int val) {
        int right,left;
        left = 0;
        for(right = 0; right < nums.length; right++){
            if(nums[right] !=val){
                nums[left++] = nums[right];
            }
        }
        return left;
    }
}
