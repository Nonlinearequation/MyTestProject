import org.junit.Test;

import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageOutputStream;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

/**
 * @author 方希萌
 * @version 1.0
 * @description TODO
 * @package PACKAGE_NAME
 * @date 2022/5/30
 */
public class byte转图片 {

    @Test
    public void m1() throws Exception {
        byte[] b = {123, 34, 101, 114, 114, 99, 111, 100, 101, 34, 58, 52, 50, 48, 48, 49, 44, 34, 101, 114, 114, 109, 115, 103, 34, 58, 34, 97, 99, 99, 101, 115, 115, 95, 116, 111, 107, 101, 110, 32, 101, 120, 112, 105, 114, 101, 100, 32, 114, 105, 100, 58, 32, 54, 50, 57, 52, 54, 98, 50, 53, 45, 54, 56, 53, 50, 102, 102, 51, 56, 45, 52, 98, 102, 55, 49, 99, 50, 98, 34, 125};
//        File img = new File("D:\\img\\04.jpg");
//        fileToByte(img);
        byte2image(b,"D:\\test.jpg");
    }

    //byte数组到图片
    public void byte2image(byte[] data,String path){
        if(data.length<3||path.equals("")) return;
        try{
            FileImageOutputStream imageOutput = new FileImageOutputStream(new File(path));
            imageOutput.write(data, 0, data.length);
            imageOutput.close();
            System.out.println("Make Picture success,Please find image in " + path);
        } catch(Exception ex) {
            System.out.println("Exception: " + ex);
            ex.printStackTrace();
        }
    }

}
