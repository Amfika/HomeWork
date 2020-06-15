import java.util.Arrays;

public class Sortirovka_viborom {
    public static void main(String[] args) {
        int[] nums = new int[]{8,4,5,66,999};

        for (int step = 0; step<nums.length; step++ ){
            System.out.println(Arrays.toString(nums));
            int in = min(nums, step);

            int s = nums[step];
            nums[step] = nums[in];
            nums[in] = s;

        }
    }
    private static int min(int[] nums, int start){
        int minIndex = start;
        int minValue = nums[start];
        for (int i=start+1; i<nums.length;i++){
            if (nums[i]<minValue){
                minValue = nums[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}

