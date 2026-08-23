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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null ||k==0){
            return head;
        }
        int length=0;
        ListNode t=head;
        while(t!=null){
            length++;
            t=t.next;
        }
         k=k%length;
        ListNode dummy=new ListNode();
        ListNode tempdummy=dummy;
        ListNode temp=head;
        while(k>0){
            temp=head;
            while(temp.next!=null && temp.next.next!=null){
                temp=temp.next;
            }
            ListNode last=temp.next;
            temp.next=null;
            temp=head;
            tempdummy.next=last;
            last.next=temp;
            head=dummy.next;
            tempdummy.next=null;
            k--;
        }
        return head;
                
    }
}