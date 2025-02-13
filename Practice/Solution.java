class Solution {
    int ans = 0;
    int rem;
    int reverse;
    int x=123;
    
    public int reverse(int x) {
        while (x != 0) { // Handle negative numbers by using x != 0
            rem = x % 10;
            x /= 10;

            // Check for overflow or underflow
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0; // Overflow
            }
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0; // Underflow
            }
            
            ans = ans * 10 + rem; // Update ans with the reversed digit
            reverse = ans;        // Store the final reversed value
        }
        return reverse; // Return the reversed number
    }
}
