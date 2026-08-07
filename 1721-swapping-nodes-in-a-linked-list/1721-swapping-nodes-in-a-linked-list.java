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
    public ListNode swapNodes(ListNode head, int k) 
    {
        ListNode temp = head;

        List<Integer> list1 = new ArrayList<>();

        while(temp != null)
        {
            list1.add(temp.val);
            temp = temp.next;
        }

        int val1 = list1.get(k-1);

        int val2 = list1.get(list1.size() - (k));

        list1.set(k-1,val2); // this is the function in order to change the value of the specific index //

        list1.set(list1.size() - k , val1);

        temp = head;

        for(int i = 0;i<list1.size();i++)
        {
            temp.val = list1.get(i);
            temp = temp.next;
        }

        return head;

    }
}