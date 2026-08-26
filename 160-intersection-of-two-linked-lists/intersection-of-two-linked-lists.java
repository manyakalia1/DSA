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
        int countB=0;
        while(tempA!=null){
            countA++;
            tempA=tempA.next;
        }
        tempA=headA;

        while(tempB!=null){
            countB++;
            tempB=tempB.next;
        }
        tempB=headB;
        int finalCount=0;
        if(countA>countB){
            finalCount=countA-countB;
            while(finalCount>0){
                tempA=tempA.next;
                finalCount--;
            }
        }
        else{
            finalCount=countB-countA;
            while(finalCount>0){
                tempB=tempB.next;
                finalCount--;
            }
        }
        while(tempA!=null && tempB!=null){
            if(tempA==tempB){
                return tempA;
            }
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return null;
        
        
    }
}