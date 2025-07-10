class Solution {
    public boolean repeatedSubstringPattern(String s) {


        String str1 =s.concat(s);
        
        String str =str1.substring(1,str1.length()-1);
        if(str.contains(s))
        {
           return true;
        }
        return false;
    }
}