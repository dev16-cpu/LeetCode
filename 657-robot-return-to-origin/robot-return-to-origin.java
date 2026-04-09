class Solution {
    public boolean judgeCircle(String moves) {
        Stack<Character> r= new Stack<>();
         Stack<Character> l= new Stack<>();
          Stack<Character> u= new Stack<>();
           Stack<Character> d= new Stack<>();

           for(int i=0;i<moves.length();i++)
           {
            if(moves.charAt(i)=='U') u.push(moves.charAt(i));
            if(moves.charAt(i)=='L') l.push(moves.charAt(i));
            if(moves.charAt(i)=='R') r.push(moves.charAt(i));
            if(moves.charAt(i)=='D') d.push(moves.charAt(i));

           }
          if (u.size() == d.size() && r.size() == l.size()) return true;
return false;

        
    }
}