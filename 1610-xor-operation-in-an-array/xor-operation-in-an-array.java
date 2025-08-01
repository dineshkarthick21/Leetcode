class Solution {
    public int xorOperation(int n, int start) {

        
        
        int arr[] = new int[n];
        int snt=0;
        for(int i=0;i<n;i++)
        {
            arr[snt++] = start+2*i; 
        }
        int sum=0;
        for(int a: arr)
        {
            sum^=a;
        }
       return sum;
        
    }
}