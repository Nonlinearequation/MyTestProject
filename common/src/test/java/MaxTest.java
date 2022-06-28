import org.junit.Test;

/**
 * @author 方希萌
 * @version 1.0
 * @description TODO
 * @package PACKAGE_NAME
 * @date 2022/4/12
 */
public class MaxTest {

    @Test
    public void test2(){
        int[] arr={4,1,6,3,9,8};
        System.out.println("arr[0]= "+arr[0]);
        int max=arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("max= "+max);
    }


}
