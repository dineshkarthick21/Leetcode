class Solution {
    public int lengthOfLastWord(String s) {
         int count =0;
         String hit =s.trim();
        char c[] = hit.toCharArray();
        emc:
        for(int i=c.length-1;i>=0;i--)
        {
            char t=c[i];
            if(Character.isLetter(t))
            {
                  count++;
            }
            else
            {
                break emc;
            }
        }
        return count;
        
    }
}