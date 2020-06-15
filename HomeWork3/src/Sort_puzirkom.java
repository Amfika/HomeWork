import java.util.Arrays;
public class Sort_puzirkom {
    public static void main(String[] args) {
        int[] nums = new int[] {2,1,5,4,3};//создали массив, который хотим отсортировать
        System.out.println(Arrays.toString(nums));
        boolean sort = false;//создали переменную флажок что массив уже отсортирован
        while (!sort){//пока массив не отсортирован
            sort = true;
            for (int i = 1; i<nums.length; i++){
                if(nums[i]<nums[i-1]) {//для каждой пары. если правый меньше чем левый
                    int temp = nums[i];//меняем местами через переменню
                    nums[i] = nums[i - 1];
                    nums[i - 1] = temp;
                    sort = false;//если происходит перестановка, сбрасываем в фолс
                }
            }
        }
        System.out.println(Arrays.toString(nums));//вывод массива в коноль
    }

}
