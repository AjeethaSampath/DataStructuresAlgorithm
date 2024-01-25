package com.programs;
public class InsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int position = -1;
        if(nums.length == 1 && target!=nums[0]){
            position = target>nums[0] ? 1 :0;
        }
       for(int i=0;i<nums.length;i++){
        if(target == nums[i]){
            System.out.println("inside");
            position = i;
            System.out.println(position);
            break;
        }
       }
       if(position == -1){
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            if(target<nums[left]){
                position = left;
                break;
            }
            else if(target>nums[right]){
                position = right+1;
                break;

            }
            else if(target>nums[left] && target<nums[right] && (left+1)==right){
                position = right;
                break;
            }
            else{
                left++;
                right--;
            }
        }
       }
        return position;
    }
    public static void main(String[] args) {
        int[] num = {1,3,5};
        System.out.println(searchInsert(num, 1));
    }
}
