class Solution {
    public boolean validMountainArray(int[] arr) {
        int max=0;
        int temp =0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>temp)
            {
                temp =arr[i];
                max=i;
            }
        }


        if(max==0 || max==arr.length-1)
        {
            return false;
        }
       
        
       for(int j=0;j<max;j++)
       {
           if(arr[j]<arr[j+1])
           {
            continue;
        
           }
           else
           {
            return false;
           }
       }
        
        for(int k=max;k<arr.length-1;k++)
       {
           if(arr[k]>arr[k+1])
           {
            continue;
            
           }
           else
           {
            return false;
           }
       }

       return true;
    }
}