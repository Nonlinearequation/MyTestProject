package http;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 * @author 方希萌
 * @version 1.0
 * @description <p>HttpClient测试</p>
 *              <p>需要先引入httpClient包</p>
 * @package PACKAGE_NAME
 * @date 2021/12/7
 */
public class HttpClientTest {

    @Test
    public void HttpClientGet(){
        // 可关闭的httpClient客户端，相当于打开一个浏览器
        CloseableHttpClient closeableHttpClient = HttpClients.createDefault();
        String urlStr = "https://www.cnblogs.com/";
        // 构造httpGet请求对象
        HttpGet httpGet = new HttpGet(urlStr);
        // 响应
        CloseableHttpResponse closeableHttpResponse;
        try {
            closeableHttpResponse = closeableHttpClient.execute(httpGet);
            // 获取响应结果
            HttpEntity httpEntity = closeableHttpResponse.getEntity();
            InputStream is = httpEntity.getContent();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
