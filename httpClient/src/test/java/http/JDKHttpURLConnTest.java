package http;

import org.junit.Test;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

/**
 * @author 方希萌
 * @version 1.0
 * @description jdk原生api请求网页
 * @package httpClient
 * @date 2021/11/19
 */
public class JDKHttpURLConnTest {

    /**
     * urlConnection获取网页内容
     * @throws IOException
     */
    @Test
    public void httpTest() throws IOException {
        String urlStr = "https://www.cnblogs.com/";
        // 构造一个url对象
        URL url = new URL(urlStr);
        // 调用这个URL对象的openConnection()方法，获取对应该该URL的URLConnection对象；
        URLConnection urlConnection = url.openConnection();
        HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;

        // try块退出时，会自动调用res.close()方法，关闭资源。不用写finally来关闭资源
        try (
                // 调用这个URLConnection的getInputStream()方法
                InputStream inputStream = httpURLConnection.getInputStream();
                // 使用通常的流API读取输入流
                InputStreamReader isr = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    /**
     * urlConnection 设置请求参数访问网页
     * 以访问首页专题模板接口为例 select_special_ad_v212
     */
    @Test
    public void httpConnectionGetTest() throws IOException {
        String urlStr = "https://testingmall.gree.com/mallv2/facade/index/select_special_ad_v212";
        URL url = new URL(urlStr);
        URLConnection urlConnection = url.openConnection();
        HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setUseCaches(false);
        // 设置请求头
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("x-flag","h5");
//        httpURLConnection.setRequestProperty("Accept-Encoding","gzip, deflate, br");
//        httpURLConnection.setRequestProperty("Accept-Language","zh-CN,zh;q=0.9");
        httpURLConnection.setRequestProperty("Content-Type","application/json;charset=UTF-8");
//        httpURLConnection.setRequestProperty("Accept","application/json, text/plain, */*");
        httpURLConnection.connect();

        // 设置请求参数
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write("{\"storeId\":\"2000001394\",\"userType\":\"10\"}".getBytes());
        outputStream.flush();
        outputStream.close();

        // 获取httpURLConnection的输入流
        try(
            InputStream is = httpURLConnection.getInputStream();
            InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);
        ){
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }



    }


}
