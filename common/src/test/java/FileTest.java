import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author 方希萌
 * @version 1.0
 * @description TODO
 * @package PACKAGE_NAME
 * @date 2022/1/20
 */
public class FileTest {

    @Test
    public void test(){
        File file = new File("aaa");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        file.deleteOnExit();
//        if (file.exists()) {
//            file.delete();
//        }
    }

}
