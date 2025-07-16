class Solution {
    public List<Integer> majorityElement(int[] nums) {

        HashMap<Integer,Integer> hash = new HashMap<>();
      int n=nums.length;
        for(int num :nums)
        {
            hash.put(num,hash.getOrDefault(num,0)+1);

        }



          List<Integer> list = new ArrayList<>();

         for(int a :hash.keySet())
         {
            if(hash.get(a)>(n/3))
            {
                list.add(a);
            }
         }

         return list;
        
        
    }
}