public class MinMax_criticalpoint {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 * A critical point in a linked list is defined as either a local maxima or a local minima.

A node is a local maxima if the current node has a value strictly greater than the previous node and the next node.

A node is a local minima if the current node has a value strictly smaller than the previous node and the next node.

Note that a node can only be a local maxima/minima if there exists both a previous node and a next node.
 * 
 
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
      int currentIndex =1;
      int firstCPI = -1;  
      int prevCPI = -1;

      ListNode curr = head.next;
      ListNode prev = head;

      int result[] = new int[2];
      result[0] = Integer.MAX_VALUE;

      while(curr.next!= null ){
        ListNode nextNode =curr.next;

        if((curr.val < nextNode.val && curr.val < prev.val ) || (curr.val > nextNode.val && curr.val > prev.val)){
            if(prevCPI == -1){
                firstCPI = currentIndex;
                prevCPI = currentIndex;

            }else{
                result[0]= Math.min(result[0], currentIndex - prevCPI);
                prevCPI = currentIndex;
            }
        }
            prev = prev.next;
            curr = curr.next;
            currentIndex++;
        }
        if(firstCPI != -1 && result[0] != Integer.MAX_VALUE){
            result[1] = prevCPI - firstCPI;
        } else{
            result[0] = -1;
            result[1] = -1;
        }
      
              return result;

    }
}
}
