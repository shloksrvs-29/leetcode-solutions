class Solution {
    public long removeZeros(long n) {
        ArrayList<Long> list = new ArrayList<>();
        while(n!=0)
        {
        long a= n%10;
        if (a!=0)
        {
            list.add(a);
        }
        n=n/10;
        }
        long ans=0;
        for (int i=list.size()-1;i>=0;i--)
        {
            ans=ans*10+list.get(i);
        }
        return ans;
    }
}