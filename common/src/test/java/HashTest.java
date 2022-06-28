import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 方希萌
 * @version 1.0
 * @description TODO
 * @package PACKAGE_NAME
 * @date 2022/5/16
 */
public class HashTest {

    @Test
    public void t1() {
        Long num1 = Long.parseLong("12345678910");
        Long num2 = Long.valueOf("12345678910");

        System.out.println(num1.hashCode());
        System.out.println(num2.hashCode());

    }

    @Test
    public void t2() {
        List<Long> longs = Arrays.asList(100002454l, 2l, 3l);
        List<String> stringList = longs.stream().map(l -> "aaa" + l).collect(Collectors.toList());
        stringList.forEach(System.out::println);
    }

}
