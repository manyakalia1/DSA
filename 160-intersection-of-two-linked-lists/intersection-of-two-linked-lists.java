/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA=headA;
        ListNode tempB=headB;
        int countA=0;
        while(tempA!=null){
            countA++;
            tempA=tempA.next;
        }
        tempA=headA;
        int countB=0;
        while(tempB!=null){
            countB++;
            tempB=tempB.next;
        }
        tempB=headB;
        if(countA>countB){
            int diff=countA-countB;
            while(diff>0){
                tempA=tempA.next;
                diff--;
            }
        }
        else{
            int diff=countB-countA;
            while(diff>0){
                tempB=tempB.next;
                diff--;
            }
        }
        while(tempA!=null && tempB!=null){
            if(tempA==tempB){
                return tempA;
            }
            else{
                tempA=tempA.next;
                tempB=tempB.next;
            }
        }
        return null;

        
    }
}