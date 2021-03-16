class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int temp=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)
            {
                temp++;
            }
            else {
                 if (temp > count){
                     count = temp;
                 } 
                 if(count > nums.length/2)
                     return count;
                 temp=0;
            }
        }
        if(temp > count)
            return temp;
        return count;
    }
}