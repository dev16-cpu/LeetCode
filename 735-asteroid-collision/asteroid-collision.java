class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st= new Stack<>();
       
        for(int a : asteroids)
        {
            Boolean q= true;
            if(a>0)
            {
                st.push(a);
                continue;
            }
            while(!st.isEmpty() && st.peek() >0 && a<0)
            {
                if(st.peek() == -a)
                {
                    st.pop();
                    q=false;
                    break;
                }
                else if(st.peek() < -a)
                {
                    st.pop();
                }
                else
                {
                    q=false;
                    break;
                }

            }
            if(q) st.push(a);
        }
        int arr[] = new int[st.size()];
        for(int i = arr.length - 1; i >= 0; i--) {
            arr[i] = st.pop();
        }

        return arr;
    }
}