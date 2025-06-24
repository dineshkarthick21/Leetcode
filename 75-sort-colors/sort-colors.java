class Solution {
    public void sortColors(int[] nums) {
     PriorityQueue<Integer> prior = new PriorityQueue<>();

     for(int num : nums)
     {
        prior.add(num);
     }
     
     int s=0;
     while(!prior.isEmpty())
     {
        nums[s++] = prior.poll();
     }
        
    }
}