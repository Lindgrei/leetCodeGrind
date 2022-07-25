package minOperations;

class Solution {
    public static int minOperations(int[] nums) {

        int[] ans=new int[nums.length];

        if(nums.length == 0 || nums.length == 1){
            return 0;
        }

        //copy all the nums value in another array which later helps to find
        // the difference

        int count=0;
        for(int numsValue : nums ){
            ans[count]=numsValue;
            count++;
        }

      /*

      in the next step

       we want to arrange the array in such a way that  previous element is always samll

       nums[]={1,5,2,4,1};  then we want to convert from to
       nums[]={1,5,6,7,8}; according to question
       then after the substract from new num to previous num we get result

      */

        for(int i= 1;  i < nums.length ; i++ ){
            if(nums[i] <= nums[i-1]){
                nums[i]=nums[i-1]+1;

            }
        }

        int diffCount=0;
        for(int i= 0 ; i< ans.length ; i++){
            diffCount=diffCount+nums[i]-ans[i];
        }

        return diffCount;



    }

    public static void main(String[] args) {
        int[] test = {1,5,2,4,1};
        System.out.println(minOperations(test));
    }
}