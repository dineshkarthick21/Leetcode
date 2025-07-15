class Solution {

    public static boolean meth(String str)
    {
          int vowel =0;
          int cons =0;
          int digit =0;
          int spe=0;
        for(char a:str.toCharArray())
        {
            if(a=='a'||a=='A'||a=='e'||a=='E'||a=='i'||a=='I'||a=='o'||a=='O'||a=='u'||a=='U')
            {
               vowel++;
            }
            else if(Character.isLetter(a))
            {
                  cons++;
            }
            else if(Character.isDigit(a))
            {
                  digit++;
            }
            else
            {
                spe++;
            }
        }
           int sum =vowel+cons+digit;
          if(vowel!=0 && cons!=0 &&sum>=3&&spe==0)  
          {
            return true;
          }
          else
          {
            return false;
          }

  
        
        
    }
    public boolean isValid(String word) {

        if(meth(word))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}