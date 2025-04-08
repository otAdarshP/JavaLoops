public class FindMinimumDebugger {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int result = findMin(nums);
        System.out.println("Minimum value in the array: " + result);
    }

    public static int findMin(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;

        System.out.println("Initial Array: ");
        printArray(nums);
        System.out.println("----------------------------");

        while (start < end) { // Corrected loop condition
            int mid = start + (end - start) / 2;

            System.out.println("start: " + start + " (" + nums[start] + ")");
            System.out.println("mid  : " + mid + " (" + nums[mid] + ")");
            System.out.println("end  : " + end + " (" + nums[end] + ")");

            if (nums[mid] > nums[end]) {
                System.out.println("nums[mid] > nums[end] → Move right");
                start = mid + 1;
            } else {
                System.out.println("nums[mid] <= nums[end] → Move left");
                end = mid;
            }

            System.out.println("----------------------------");
        }

        System.out.println("Final Answer Index: " + start + " → Value: " + nums[start]);
        return nums[start];
    }

    private static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
