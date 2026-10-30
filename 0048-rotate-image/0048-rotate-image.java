class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for (int i=0;i<n;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++)
        {
                    int s=0,t=n-1;

            while (t>=s)
            {
                int temp=matrix[i][s];
                matrix[i][s]=matrix[i][t];
                matrix[i][t]= temp;
            s++;
            t--;
            }
        }
    }
}