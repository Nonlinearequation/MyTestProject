import org.junit.Test;

/**
 * @author 方希萌
 * @version 1.0
 * @description TODO
 * @package PACKAGE_NAME
 * @date 2021/12/22
 */
public class IntegerTest {

    @Test
    public void maxInteger() {
        System.out.println("超出int最大值的string转int parseInt" + Integer.parseInt("999999999999999",10));
        System.out.println(Integer.MAX_VALUE);
    }
}
