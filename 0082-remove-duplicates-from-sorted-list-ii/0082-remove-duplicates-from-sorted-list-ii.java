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
    public ListNode deleteDuplicates(ListNode head) 
    {
        if(head == null || head.next == null)
        {
            return head;
        }

        Map<Integer,Integer> map1 = new HashMap<>();

        ListNode temp = head;

        while(temp != null)
        {
            if(map1.containsKey(temp.val))
            {
                map1.put(temp.val,map1.get(temp.val) + 1);
            }
            else
            {
                map1.put(temp.val,1);
            }

            temp = temp.next;
        }

        List<Integer> unique = new ArrayList<>();

        temp = head;
        
        while(temp != null)
        {
            if(map1.get(temp.val) == 1)
            {
                unique.add(temp.val);
            }

            temp = temp.next;
        }

        if(unique.size() == 0)
        {
            return null;
        }

        ListNode newhead = new ListNode(unique.get(0));

        ListNode temp2 = newhead;

        for(int i = 1;i<unique.size();i++)
        {
            ListNode newnode = new ListNode(unique.get(i));
            temp2.next = newnode;
            temp2 = temp2.next;
        }

        return newhead;
    }
}


