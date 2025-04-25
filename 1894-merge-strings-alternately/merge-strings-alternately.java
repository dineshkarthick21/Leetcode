class Solution {
    public String mergeAlternately(String word1, String word2) {


        int a=word1.length();
        int b=word2.length();
        int len =a+b;
        StringBuilder str = new StringBuilder();
        for(int i=0;i<len;i++)
        {

            if(i<a)
            {
                str.append(word1.charAt(i));
            }
            if(i<b)
            {
                str.append(word2.charAt(i));
            }

        }
        return str.toString();
    }
}