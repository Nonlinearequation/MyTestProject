import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 方希萌
 * @version 1.0
 * @description TODO
 * @package PACKAGE_NAME
 * @date 2022/1/14
 */
public class StreamTest {

    @Test
    public void m() {
        List<String> list = new ArrayList<>();
        list.stream().filter(a->a.equals("1")).findFirst().orElseGet(()->null);
    }
}
