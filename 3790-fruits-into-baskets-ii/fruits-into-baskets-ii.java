class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {



        int snt=0;
        for(int i=0;i<fruits.length;i++)
        {
            boolean valid =false;
            for(int j=0;j<baskets.length;j++)
            {
                if(fruits[i]<=baskets[j])
                {
                    baskets[j]=0;
                    valid=true;
                    break;
                }
            }

            if(valid==false)
            {
               snt++;
            }
        }
        
        return snt;
    }
}