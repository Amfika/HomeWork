import java.util.Arrays;

public class each2elemOfMassive {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4,5};
        System.out.println(Arrays.toString(nums));
        for (int i = 1; i<nums.length; i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }

    }
}
