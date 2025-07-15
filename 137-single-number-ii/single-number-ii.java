class Solution {
    public int singleNumber(int[] nums) {


        HashMap<Integer,Integer> hash = new HashMap<>();

        for(int num :nums)
        {
            hash.put(num,hash.getOrDefault(num,0)+1);


        }

        for(int f :hash.keySet())
        {
            if(hash.get(f)==1)
            {
                return f;
            }
        }
        return -1;
    }
}