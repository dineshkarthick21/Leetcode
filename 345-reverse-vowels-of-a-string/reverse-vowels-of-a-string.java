class Solution {
    

    public static boolean isVowel(char c)
    {
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
        {
            return true;
        }
        else
        {
            
        return false;
        }
    }
   public String reverseVowels(String s) {
        
        char[] str =s.toCharArray();
        
        int left =0;
        int  right =s.length()-1;
        
        while(left<=right)
        {
            boolean s1 =isVowel(str[left]);
            boolean s2 =isVowel(str[right]);
            
            if(s1&&s2)
            {
                char temp=str[left];
                str[left]=str[right];
                str[right] =temp;
                right--;
                left++;
            }
            else if(s1==true)
            {
                right--;
            }
            else
            {
                left++;
            }
            
        }
        return new String(str);
        
        
    }
        
    
}