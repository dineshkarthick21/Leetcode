class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        

        int n=x;
        int sum=0;
        while(x>0)
        {
            int temp =x%10;
            sum+=temp;
            x/=10;
        }

        if(n%sum==0) return sum;
        return -1;
    }
}