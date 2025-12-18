public class JumpGame {

    public static int findMinJumps(int[] nums) {
        if (nums.length <= 1) {
            return 0;
        }

        int jumps = 0;
        int start = 0;
        int end = 0;

        while (end < nums.length - 1) {
            int farthest = getFarthestIndex(nums, start, end);
            start = end + 1;
            end = farthest;
            jumps++;
        }

        return jumps;
    }

    private static int getFarthestIndex(int[] nums, int start, int end) {
        int farthest = end;
        for (int i = start; i <= end; i++) {
            farthest = Math.max(farthest, i + nums[i]);
        }
        return farthest;
    }

    public static void main(String[] args) {
        int[] nums1 = {2,4,1,1,1,1};
        int[] nums2 = {2,1,2,1,0};

        System.out.println(findMinJumps(nums1)); // 2
        System.out.println(findMinJumps(nums2)); // 2
    }
}
