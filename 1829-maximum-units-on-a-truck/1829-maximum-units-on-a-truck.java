class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {

        int n=boxTypes.length;
        int ans=0;
        
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(boxTypes[i][1]<boxTypes[j][1])
                {
                    int t1=boxTypes[i][0];
                    int t2=boxTypes[i][1];

                    boxTypes[i][0]=boxTypes[j][0];
                    boxTypes[i][1]=boxTypes[j][1];

                    boxTypes[j][0]=t1;
                    boxTypes[j][1]=t2;
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            truckSize=truckSize-boxTypes[i][0];

            if(truckSize>=0)
            ans=ans+(boxTypes[i][0]*boxTypes[i][1]);

            else
            {
            ans=ans+((truckSize+boxTypes[i][0])*boxTypes[i][1]);
            return ans;
            }
           
        //    System.out.println(ans);

        }

        return ans;
        
    }
}