class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> pascel = new ArrayList<>();

        for(int i=0;i<numRows;i++)
        {
            List<Integer> row = new ArrayList<>();
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

        return pascel;
        
    }
}