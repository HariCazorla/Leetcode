/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
#include "math.h"
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        long  a = 0, b = 0;
        long  carry = 0;
        
        if (!l1) return l2;
        if (!l2) return l1;
        ListNode* prev = NULL;
        ListNode* root = NULL;
        while( l1 || l2 || carry)
        {
            int val = 0;
            if (l1 && l2)
                val = (carry) ? l1->val + l2->val + carry : l1->val + l2->val;

            else if (l1 && !l2)
                val = (carry) ? l1->val + carry : l1->val;
            
            else if (l2 && !l1)
                val = (carry) ? l2->val + carry : l2->val;
            
            else
                val = carry;
            
            carry = (val < 10) ? 0 : 1;
            
            if (val >= 10)
            {
                val = val % 10;
            }
            ListNode* node = new ListNode();
            node->val = val;

            if (!prev)
            {
                prev = node;
                root = prev;
            }
            else
            {
                prev->next = node;
                prev = node;
            }
            if (l1)
                l1 = l1->next;
            if (l2)
                l2 = l2->next;
        }
        return root;
    }
};