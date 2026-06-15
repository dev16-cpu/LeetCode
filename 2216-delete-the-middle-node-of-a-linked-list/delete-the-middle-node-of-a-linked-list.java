/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ArrayList<Integer> list=new ArrayList<>();
        while(head!=null)
        {
            list.add(head.val);
            head=head.next;
        }
        int middle=list.size()/2;
        ListNode newlist= new ListNode(0);
        ListNode curr= newlist;
        for(int i=0;i<list.size();i++)
        {
            if(middle==i) continue;
            curr.next= new ListNode(list.get(i));
            curr=curr.next;
        }
        return newlist.next;
    }
}