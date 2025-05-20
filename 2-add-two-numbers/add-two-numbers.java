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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); //creating a dummy (empty) list
        ListNode curr = dummy; // pointer
        int carry = 0;

         // while loop will run, until l1 OR l2 not reaches null OR if they both    reaches null. But our carry has some value in it.
        while(l1 != null || l2 != null || carry == 1)
        {
            int sum = 0;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry; //if we have carry add it to sum
            carry = sum /10; //if we get carry, then divide it by 10 to get the carry
            ListNode node = new ListNode(sum % 10); //the value we will get by modulating it, will become as new node, so add it to our list
            curr.next = node;
            curr = curr.next;
        }
        return dummy.next; // return dummy.next as we don't want the value we have consider in it intially!!

    }
}