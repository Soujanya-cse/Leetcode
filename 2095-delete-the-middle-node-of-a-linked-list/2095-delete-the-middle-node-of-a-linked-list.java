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
        ArrayList<Integer> a = new ArrayList<>();

        while(head!=null){
            a.add(head.val);
            head=head.next;
        }

        int skip=a.size();
        skip=(skip/2)+1;
        int count=0;

        ListNode root=null;
        head=null;

        for(int i:a){
            count++;

            if(count==skip){
                continue;
            }

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