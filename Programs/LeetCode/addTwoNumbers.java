class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy= new ListNode(0);
        ListNode curr = dummy;
        int carry=0;
        while (l1 !=null || l2 !=null){
            int x=0;
            int y=0;
            if(l1 != null) {
                x=l1.val;
                l1=l1.next;
            }
            if(l2 != null){
                y = l2.val;
                l2=l2.next;
            }
            int sum = carry  + x+y;
            carry =sum /10;
            curr .next = new ListNode(sum%10);
            curr = curr.next;
        }
        if(carry >0){
            curr.next =new ListNode(carry);
        }
        return dummy.next;
}
}
