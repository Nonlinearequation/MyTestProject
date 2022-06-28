import org.junit.Test;

import java.util.Arrays;

/**
 * @author 方希萌
 * @version 1.0
 * @description TODO
 * @package PACKAGE_NAME
 * @date 2022/4/14
 */
public class 二维数组 {

    @Test
    public void m1(){
        int[][] arr=new int[3][];
        arr[0]=new int[]{11,12};
        arr[1]=new int[]{21,22,23};
        arr[2]=new int[]{31,32,33,34};
        int sum=0;
        for (int i=0;i<arr.length;i++){
            int groupSum=0;
            System.out.println(arr[i].length);
            System.out.println("arr[0]=" + Arrays.toString(arr[i]));
            for (int j=0;j<arr[i].length;j++) {
                groupSum = groupSum + arr[i][j];
            }
            sum+=groupSum;
            System.out.println("第"+(i+1)+"小组销售额："+groupSum);
        }
        System.out.println("总销售额为："+sum);
    }
}

