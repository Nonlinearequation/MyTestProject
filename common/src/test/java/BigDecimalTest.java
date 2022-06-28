import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author 方希萌
 * @version 1.0
 * @description TODO
 * @package PACKAGE_NAME
 * @date 2022/3/3
 */
public class BigDecimalTest {

    @Test
    public void rangeTest(){

    }

    private void range(String num, int scale, String min, String max) {
        BigDecimal numb = new BigDecimal(num);
        BigDecimal minb = new BigDecimal(min);
        BigDecimal maxb = new BigDecimal(max);

        boolean sellPriceFlag = numb != null
                && numb.compareTo(numb.setScale(scale, BigDecimal.ROUND_DOWN)) == 0
                && numb.compareTo(minb) > 0 && numb.compareTo(maxb) <= 0;

    }

}
