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
    public ListNode reverseList(ListNode head) {
        ListNode temp = new ListNode(-1001);
        while(head != null){
            ListNode curr = head;
            ListNode next = head.next;
            if(temp.val!=-1001){
                curr.next = temp;
            }else{
                curr.next = null;
            }
            temp = curr;
            head = next;
        }


        return temp.val == -1001 ? null : temp;
        
    }
}
