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
    public int getDecimalValue(ListNode head) {
        ListNode curr=head;
        ListNode next=null;
        ListNode prev=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        int sum=0;
        int pow=0;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val==1){
                sum+=(int)Math.pow(2,pow);
            }
                temp=temp.next;
                pow++;
            
        }
        return sum;
    }
}