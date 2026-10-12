class Solution {
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int x:arr)
        {
            list.add(x);
        }
        Collections.sort(list);
        int i=1;
        int c=0;
        while(true)
        {
            if(!list.contains(i)) c++;
            if(c==k) return i;
            i++;
        }
       
        
    }
}