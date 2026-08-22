class Solution {
    public boolean checkDivisibility(int n) {
        int ans=n;
        int sum=0;
        int pro=1;
        int temp=0;
        while(n>0){
        temp=n%10;
        sum+=temp;
        pro*=temp;
        n=n/10;
        }
        int a=sum+pro;
        if(ans%a==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}