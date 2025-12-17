class Add_two_num {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode h = new ListNode(0); 
        ListNode temp = h;            
        int c = 0;                   

        while (l1 != null || l2 != null || c != 0) {

            int sum = c;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            c = sum / 10;               
            temp.next = new ListNode(sum % 10);
            temp = temp.next;
        }

        return h.next;
    }
}