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
class Solution 
{
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) 
    {
        ListNode temp = list1;

        int i = 0;

        while(i < a-1)
        {
            temp = temp.next;
            i++;
        }

        ListNode store = temp.next;
        i++;

        temp.next = list2;

        temp = temp.next;

        // ListNode store = temp;

        while(temp.next != null)
        {
            temp = temp.next;
        }

        while(i < b)
        {
            store = store.next;
            i++;
        }

        temp.next = store.next;

        temp = temp.next;

        while(temp != null)
        {
            temp = temp.next;
        }

        return list1;
    }
}