class Solution {

    public static int meth(int n)
    {
        int sum =0;
       while(n!=0)
       {
        int digit = n%10;
        sum+=digit*digit;
        n=n/10;
       }
       return sum;
    }
    public boolean isHappy(int n) {

        if(n==0)
        {
            return false;
        }
        Set<Integer> set = new HashSet<>();

        while(n!=1 && !set.contains(n))
        {
            set.add(n);
            n=meth(n);
        }
        if(n==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}