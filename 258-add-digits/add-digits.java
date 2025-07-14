class Solution {


    public static int meth(int n)
    {
        int sum=0;
        while(n!=0)
        {
            int b=n%10;
            sum+=b;
            n=n/10;


        }
        return sum;

    }
    public int addDigits(int num) {

        while(num>9)
        {
            num=meth(num);
        }
        return num;
        
    }
}