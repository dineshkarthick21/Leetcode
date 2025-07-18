class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<List<Integer>> pascel = new ArrayList();
        

        for(int i=0;i<=rowIndex;i++)
        {
            List<Integer> row  = new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                {
                    row.add(1);

                }
                else
                {
                    List<Integer> prev = pascel.get(i-1);
                    row.add(prev.get(j)+prev.get(j-1));

                }
            }
            pascel.add(row);
            

            
        }
        
          List<Integer> fin = pascel.get(rowIndex);  
        return fin;
    }
}