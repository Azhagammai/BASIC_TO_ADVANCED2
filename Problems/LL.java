// public void reverse() {
//     if (head == null || head.next == head) {
//         return; // Empty or single node list, nothing to reverse
//     }

//     CNode prev = null;
//     CNode current = head;
//     CNode next;
//     CNode last = head; // Keep track of last node

//     do {
//         next = current.next;
//         current.next = prev;
//         prev = current;
//         current = next;
//     } while (current != head);

//     head.next = prev;
//     head = prev; // Update head to new first node
// }

// public void reverse() {
//     DNode temp = null;
//     DNode current = head;

//     while (current != null) {
//         temp = current.prev;
//         current.prev = current.next;
//         current.next = temp;
//         current = current.prev; // Move to the next node
//     }

//     if (temp != null) {
//         head = temp.prev; // Update head to new first node
//     }
// }

// public void reverse() {
//     Node prev = null;
//     Node current = head;
//     Node next;
//     while (current != null) {
//         next = current.next; // Store next node
//         current.next = prev; // Reverse current node's link
//         prev = current; // Move prev and current forward
//         current = next;
//     }
//     head = prev; // Update head to new first element
// }