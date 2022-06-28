import com.alibaba.fastjson.JSON;
import dto.WxMiniProgramSubscribeMessageDTO;
import org.junit.Test;

/**
 * @author 方希萌
 * @version 1.0
 * @description TODO
 * @package PACKAGE_NAME
 * @date 2022/5/26
 */
public class JsonTest {

    class Product{
        String name;
        String age;

        public Product(String name, String age) {
            this.name = name;
            this.age = age;
        }
    }

    @Test
    public void messageTest() {
        Product a = new Product("xx",null);
        Product product = JSON.parseObject(JSON.toJSONString(a), Product.class);
        System.out.println(JSON.toJSONString(product));
    }

    @Test
    public void nullTest() {
        System.out.println(null==null);
    }

}
