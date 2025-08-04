class Solution {
    public boolean detectCapitalUse(String word) {


        int caps = 0;
        int small=0;
        for(char c:word.toCharArray())
        {
            if(Character.isUpperCase(c))
            {
                caps++;
            }
            else if(Character.isLowerCase(c))
            {
                small++;
            }
        }
        if(caps==word.length())
        {
            return true;
        }
       if(small==word.length())
        {
            return true;
        }
        char temp =word.charAt(0);
        if(Character.isUpperCase(temp))
        {
            for(int i=1;i<word.length();i++)
            {
                char t=word.charAt(i);
                if(Character.isLowerCase(t))
                {
                    continue;
                }
                else
                {
                    return false;
                }
            }
        }
        else
        {
            return false;
        }
        
        return true;
        
    }
}