class Solution {
    public String addBinary(String a, String b) {
        

        


        // String s1 ="10101";
        // String s2 = "10101";
        
        int i =a.length()-1;
        int j=b.length()-1;
        int count =0;
        int  bit1=0;
        int bit2=0;
        StringBuilder str = new StringBuilder();
        
        while(i>=0 ||j>=0 ||count!=0)
        {
            if(i>=0)
            {
                 bit1=a.charAt(i--)-'0';
            }else
            {
                bit1=0;
            }
            
            if(j>=0)
            {
                 bit2 =b.charAt(j--)-'0';
            }
            else
            {
                bit2 =0;
            }
            
            int fin =bit1+bit2+count;
            str.append(fin% 2);
            count =fin/2;
            
        }
        
        return str.reverse().toString();
    }

}


    