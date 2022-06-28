package pay;

import aes.AesException;
import org.apache.commons.codec.binary.Base64;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author 方希萌
 * @version 1.0
 * @description TODO
 * @package com.gree.ecommerce.wxpay.util
 * @date 2022/4/27
 */
public class WxVideoTest {

    public static void main(String[] args) throws AesException, IOException, ParserConfigurationException, SAXException {
        String encodingAesKey = "rGwxyqy7jCuBsi2qonrgtr4n2Dd1csEFv7tDVm6Fjz9";
//        String base64 = Base64.encode(encodingAesKey).substring(0,43);
//        byte[] base64 = Base64.encodeBase64(encodingAesKey.getBytes(StandardCharsets.UTF_8));
//        String key = new String(base64, StandardCharsets.UTF_8).substring(0,43);
//        String base64 = Base64.getEncoder().encodeToString(encodingAesKey.getBytes()).substring(0,43);
        String token = "AuahLbYOaW086c666LtulIdQmrs0YQ8i";
        String timestamp = "1651803621";
        String nonce = "758971677";
        String appId = "wxf3f8ee2278bf9ae4";
        String miwen = "<xml><ToUserName><![CDATA[toUser]]></ToUserName><Encrypt><![CDATA[g0eEvg3Vbp86wAyv4EuhsONYg4t9zcXxb1Mk0FOfv6Ym2YWhSfhTYGyimzrF64Bx+Dj8PKfkXDHEFcUMTm6B5SRgKFUzIFXu/9otSIh2pdUXj7+IC5yqMWceE0f43KlMOtSQTrgztfA4bvlcZxykyn0MNIZtHvHFUwrcomLXk87XxfFhRrNyOdVXkETGEhjb+/4fpX+CjVhDi5uI90y42/j3/W0sB35v1GeIxkbGOeph941GYJ4cqqHcXvsgq4lOCsX7F3VUQVJmPN1AhKNp+T4MYDVGdNS+xN5DnhkPDH1l3ChG4eEMhLv9bJACbzAdYH+KO6cTs5kQ1B/vk1/eEDYBpghSZOJkSefhUIVcFBNgPhTSpeAnTNO0EmE/tvckrbJ2arbIuRKqjPw8cqQuwF8COWV+y43y5c14siyZTVDzB9AFeF9H+6sUm+eC5/3lE/zTFh4c9V2MKX5/p3bXjzWxNAXFzQZNyn7pPQ348TNe4aQl0olOibJX+6KOZVJ8wV6oEosGc3GlYjEdmtPBeYUkVBNXwWUTtZcMciOY4hmcen1hjMILPGvMqAARHBZPgRM07YtxG6NKMOnVbzUGWJ/AuKoGgppNZb6v6Mpb4kCN766ZuMv88pOYPatEIz2YXoDj/zhRlFzcamstGHjAbHq4MKJPunpDVmyqhlQf3VPfE4kJ5ktvvVyIdUt06SkQtxubCXn3+i41VfHlubfSu2aIaRy16Fb2a1M+86Veim3L5kLF9YOg5f6Cmw7agUIi]]></Encrypt></xml>";

        WxPayUtil wxPayUtil = new WxPayUtil();
        String mingwen = wxPayUtil.decryptMsg(token, encodingAesKey, appId, timestamp, nonce, miwen);
        System.out.println(mingwen);
    }


}
