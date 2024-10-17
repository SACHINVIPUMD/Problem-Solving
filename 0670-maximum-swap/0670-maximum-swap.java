class Solution {
    public int maximumSwap(int num) {
        char[] digits = Integer.toString(num).toCharArray();  // Convert the number to a char array
        
        int maxIndex = -1, x = -1, y = -1;  // Variables to store indices for swapping

        // Traverse the digits to find the best swap
        for (int i = digits.length - 1; i >= 0; i--) {
            if (maxIndex == -1 || digits[i] > digits[maxIndex]) {
                maxIndex = i;  // Update maxIndex to track the largest digit
            } else if (digits[i] < digits[maxIndex]) {
                x = i;  // Track the smaller digit to swap
                y = maxIndex;  // Track the larger digit for the swap
            }
        }

        // If swap indices are found, swap the digits
        if (x != -1) {
            char temp = digits[x];
            digits[x] = digits[y];
            digits[y] = temp;
        }

        return Integer.parseInt(new String(digits));  // Convert the char array back to an integer and return
    }
}
