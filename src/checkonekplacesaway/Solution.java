package checkonekplacesaway;

class Solution {
    public boolean kLengthApart(int[] nums, int k) {



        for (int i = 1; i < nums.length; i++) {
            int lastIndex = 1;
            if(nums[i] == 1 && i == 1){
                lastIndex = i;
            }
            else if(nums[i] == 1 ){
                int indexD = indexDiff(i, lastIndex);
                if (indexD <= k){
                    boolean b  = true;
                    lastIndex = i;
                } else if (indexD > k) {
                    boolean b = false;
                    lastIndex = i;
                }
            }

        }
        return b;
    }

    public int indexDiff(int currentIndex, int lastIndex){
        return currentIndex - lastIndex;
    }
}