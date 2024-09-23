class Solution
{
    public int nthUglyNumber(int n)
    {
        List<Integer> ugl=new ArrayList<Integer>();
        ugl.add(1);

        int i2=0;
        int i3=0;
        int i5=0;

        while(ugl.size()<n)
        {
            final int n2=ugl.get(i2)*2;
            final int n3=ugl.get(i3)*3;
            final int n5=ugl.get(i5)*5;
            final int nt=Math.min(Math.min(n2,n3),n5);
            if(nt==n2) i2++;
            if(nt==n3) i3++;
            if(nt==n5) i5++;
            ugl.add(nt);
        }
        return ugl.get(ugl.size()-1);
    }
}