class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        String a = String.valueOf(x);

        for(int i=0;i<words.length;i++)
        {
            if(words[i].contains(a))
            {
                list.add(i);
            }
        }
        return list;
        
    }
}