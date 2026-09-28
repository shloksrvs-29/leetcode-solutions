class Solution {
    public int maxDepth(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        int arr[]=new int[n];
        int count=0;
        for (int i=0;i<n;i++)
        {
            if(s.charAt(i)=='(')
            {
                st.push(s.charAt(i));
                count++;
            }
            else if(s.charAt(i)==')')
            {
                st.pop();
                count--;
            }
            arr[i]=count;
        }
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
}