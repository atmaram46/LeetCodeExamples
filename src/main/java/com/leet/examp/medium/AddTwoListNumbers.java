package com.leet.examp.medium;

public class AddTwoListNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode valueHolder = result;
        int carry = 0;
        while(l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carry;
            if(sum >= 10) {
                result.val = sum%10;
                carry = sum/10;
            } else {
                result.val = sum;
                carry = 0;
            }
            ListNode newData = new ListNode();
            result.next = newData;
            result = newData;
            l1 = l1.next;
            l2 = l2.next;
        }
        if(l1 != null) {
            while(l1 != null) {
                int sum = l1.val + carry;
                if(sum >= 10) {
                    result.val = sum%10;
                    carry = sum/10;
                } else {
                    result.val = sum;
                    carry = 0;
                }
                l1 = l1.next;
                ListNode newData = new ListNode();
                result.next = newData;
                result = newData;
            }
        } else if(l2 != null) {
            while(l2 != null) {
                int sum = l2.val + carry;
                if(sum >= 10) {
                    result.val = sum%10;
                    carry = sum/10;
                } else {
                    result.val = sum;
                    carry = 0;
                }
                l2 = l2.next;
                ListNode newData = new ListNode();
                result.next = newData;
                result = newData;
            }
        }
        if(carry != 0) {
            result.val = carry;
            result.next = null;
        } else {
            result = null;
        }
        result = valueHolder;
        while(result.next != null) {
            if(result.next.next == null && result.next.val == 0) {
                result.next = null;
                break;
            }
            result = result.next;
        }
        return valueHolder;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode();
        l1.val = 2;
        ListNode  valu2 = new ListNode();
        ListNode val3 = new ListNode();
        val3.val = 3;
        val3.next = null;
        valu2.val = 4;
        valu2.next = val3;
        l1.next = valu2;
        ListNode l2 = new ListNode();
        l2.val = 5;
        ListNode val2 = new ListNode();
        val2.val = 6;
        ListNode v3 = new ListNode();
        v3.val = 4;
        v3.next = null;
        val2.next = v3;
        l2.next = val2;
        addTwoNumbers(l1, l2);
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
