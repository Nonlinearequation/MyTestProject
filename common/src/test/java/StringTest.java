import org.junit.Test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 方希萌
 * @version 1.0
 * @description TODO
 * @package PACKAGE_NAME
 * @date 2022/2/9
 */
public class StringTest {

    @Test
    public void m1(){
        System.out.println("".equals(null));
    }

    @Test
    public void m2(){
        System.out.println("123".substring(2,3));
    }

    // 校验字符串是否为数字（包括负数）
    @Test
    public void m3() {
        String parr = "^(-?[0-9]+)(.[0-9]{0,2})?$";
        Pattern pattern = Pattern.compile(parr);
        String[] money = {"1", "-1.2", "-0.01", "1.00", "0.1", "- 1", "1.001", "aaa", "true", "1.01a", "100000000366546", "  45454151.12", "1231 232", "31232 .32"};
        Arrays.stream(money).forEach(n -> System.out.println(n + " " + pattern.matcher(n.trim()).matches()));
    }

}
