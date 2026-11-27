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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1;
        int count=0;
        while(count<a-1){
            count++;
            temp=temp.next;
        }
        ListNode temp1 =temp.next;
        temp.next=list2;
        while(temp.next!=null){
            temp=temp.next;
        }
        while(count<b){
            count++;
            temp1=temp1.next;
        }
        temp.next=temp1;
        return list1;
    }
}