class Solution {
    public int findNumbers(int[] nums) {
        int even=0;
        for(int no : nums){
            int count=0;
            while(no!=0){
                no=no/10;
                count++;
            }
            if(count%2==0)
                even++;
            count=0;
        }
        return even;
    }
}