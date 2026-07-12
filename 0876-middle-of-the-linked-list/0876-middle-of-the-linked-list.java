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
    public ListNode middleNode(ListNode head) {
        ListNode l=head;

        int len=0;

        while(head!=null){
            len++;
            head=head.next;
        }

        len=len/2;
        len++;

        head=l;

        int count=0;
        while(head!=null){
            count++;
            if(count==len){
                return head;
            }
            head=head.next;
        }

        return head;
    }
}