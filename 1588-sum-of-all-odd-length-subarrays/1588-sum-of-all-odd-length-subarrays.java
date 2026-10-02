class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n=arr.length;
        int sum=0;
        for (int i=0;i<n;i++)
        {
            for (int j=i;j<n;j++)
            {
                if ((j-i+1)%2!=0)
                {
                    for (int s=i;s<=j;s++)
                    {
                        sum+=arr[s];
                    }
                }
            }
        }
        return sum;
    }
}