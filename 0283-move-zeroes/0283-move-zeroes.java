class Solution {
    public void moveZeroes(int[] nums) {
       int l =0;
       int r = 0;
       while(r<nums.length){
        if(nums[r]!=0){
            nums[l] = nums[r];
            l++;
        }
        r++;
       }
       for(int i=l;i<nums.length;i++){
        nums[i] = 0;
       }
    }
}