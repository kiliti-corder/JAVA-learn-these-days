import java.util.Random;

/**
 * @author shkstart
 * @create 2021-01-28-6:40 PM
 */
//6.定义一个数组，求这个数组里面的最大数，最小数
public class MaxOrMinArraysTest06 {
    int[] arr = new int[10];
    Random random = new Random();

    public int MaxAndMinShow(){
        int max = arr[0];
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            arr[i]  = random.nextInt(11);
            System.out.println("未排序前数组如此:" );
            System.out.print( arr[i] + "\t");
        }
        for( int i = 0; i < arr.length; i++){
            if(arr[i] > max ){
                max = arr[i];

            }
            if(arr[i] < min){
                min  = arr[i];
            }
        }
        System.out.println("Max is: " + max );
        System.out.println("Min is: " + min);
        return 0;
    }
    public static void main(String[] args){
        MaxOrMinArraysTest06 maxOrMinArraysTest06 = new MaxOrMinArraysTest06();
        maxOrMinArraysTest06.MaxAndMinShow();
    }
}


