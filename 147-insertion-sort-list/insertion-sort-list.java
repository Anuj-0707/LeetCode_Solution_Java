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
    public ListNode insertionSortList(ListNode head) {
        ListNode d = new ListNode(-5001);
        d.next = head;
        ListNode prev= d;
        ListNode curr= head;
        while(curr!=null){
            if(curr.val>=prev.val){
                prev = curr;
                curr=curr.next;
            }
            else{
                ListNode p=d;
                ListNode c=d.next;
                ListNode target = curr;
                while(c.val<=target.val){
                    p=c;
                    c=c.next;
                }
                curr=curr.next;
                prev.next=curr;
                p.next=target;
                target.next=c;
            }
        }
        return d.next;
    }
}