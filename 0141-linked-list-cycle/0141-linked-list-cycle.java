/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode l=head;

        HashSet h = new HashSet();

        while(head!=null){
            if(h.contains(head)){
                return true;
            }            
            h.add(head);
            head=head.next;
        }
        return false;
    }
}