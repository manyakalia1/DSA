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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer>list=new ArrayList<>();
        ListNode temp=list1;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        temp=list2;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(list);
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        for(int num:list){
            curr.next=new ListNode(num);
            curr=curr.next;
        }
        return dummy.next;
        
    }
}