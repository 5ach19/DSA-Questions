
/*
 * 2181. Merge Nodes in Between Zeros
 * 
 * LINK- https://leetcode.com/problems/merge-nodes-in-between-zeros/description/?envType=daily-question&envId=2024-07-04
 * 
 * Input: head = [0,3,1,0,4,5,2,0]
Output: [4,11]
Explanation: 
The above figure represents the given linked list. The modified list contains
- The sum of the nodes marked in green: 3 + 1 = 4.
- The sum of the nodes marked in red: 4 + 5 + 2 = 11.
 */
  public class Question1 {
    
    
    public ListNode mergeNodes(ListNode head ) {
      // create a node and temp in head.next
      ListNode node = head.next;
      ListNode temp = node;
      //find sum in separate block
      while(temp != null){
          int sum = 0;
          while(temp.val != 0){
              sum += temp.val;
              temp = temp.next;
          }
      //update value in node and connect to next block
       node.val = sum;
       //move to next block
       temp = temp.next;
       node.next= temp;
       node = temp;
      }
      // skip the head of LL because head of input is always 0
      head = head.next;
      return head;
      
  }
}

class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
