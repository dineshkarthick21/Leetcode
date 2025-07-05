class Solution {
    public int findLucky(int[] arr) {

        int len=0;
        int fin=0;
        
        
        for(int i=0;i<arr.length;i++)
        {
            int count =0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]==arr[i])
                {
                    count++;
                }
            }
            if(count==arr[i])
            {
                if(count>len)
                {
                    len=count;
                    fin=arr[i];
                }
            }
        }

        if(len==0||fin==0)
        {
            return -1;
        }
        return fin;
        
    }
}