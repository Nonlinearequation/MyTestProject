import org.junit.Test;

/**
 * @author 方希萌
 * @version 1.0
 * @description TODO
 * @package PACKAGE_NAME
 * @date 2022/3/29
 */
public class ByteTest {

    @Test
    public void t1(){
        int i = 127;
        byte a = (byte) i;
        System.out.println(a);
        i++;
        a = (byte) i;
        System.out.println(a);




    }

}
