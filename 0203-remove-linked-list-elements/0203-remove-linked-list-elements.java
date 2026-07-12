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
    public ListNode removeElements(ListNode head, int val) {
        ArrayList<Integer> a = new ArrayList<>();

        while(head!=null){
            if(head.val!=val){
                a.add(head.val);
            }
            head=head.next;
        }

        ListNode root=null;
        head=null;

        for(int i:a){
            ListNode temp = new ListNode(i);

            if(root==null){
                root=temp;
                head=temp;
            }
            else{
                root.next=temp;
                root=root.next;
            }
        }

        return head;
    }
}