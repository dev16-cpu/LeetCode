class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        
int mindif = Integer.MAX_VALUE;

for(int i = 1; i < arr.length; i++) {
    mindif = Math.min(mindif, arr[i] - arr[i - 1]);
}
           List<List<Integer>> ans = new ArrayList<>();
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]-arr[i-1]==mindif)
            {
                ans.add(Arrays.asList(arr[i-1],arr[i]));
            }
                
        
        }
        return ans;
        
    }
}