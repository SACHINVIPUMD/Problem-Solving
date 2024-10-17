class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // Map to store the next greater element for each number in nums2
        HashMap<Integer, Integer> map = new HashMap<>();
        // Stack to store elements in a decreasing order to find next greater elements
        Stack<Integer> stack = new Stack<>();

        // Traverse through nums2 array
        for (int num : nums2) {
            // While the current number is greater than the top of the stack
            // it means the current number is the next greater element for the top element in the stack
            while (!stack.isEmpty() && stack.peek() < num) {
                // Pop the stack and record the next greater element in the map
                map.put(stack.pop(), num);
            }
            // Push the current number onto the stack
            stack.push(num);
        }

        // For the remaining elements in the stack, there are no next greater elements
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }

        // Prepare the result for nums1 based on the next greater elements stored in the map
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.getOrDefault(nums1[i], -1);
        }

        return ans;
    }
}
