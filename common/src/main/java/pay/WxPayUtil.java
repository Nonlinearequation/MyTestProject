package pay;

import aes.AesException;
import aes.WXBizMsgCrypt;
//import cn.hutool.core.codec.Base64;
//import cn.hutool.core.io.FileUtil;
//import cn.hutool.core.util.CharsetUtil;
//import cn.hutool.core.util.StrUtil;
//import cn.hutool.crypto.SecureUtil;
//import cn.hutool.crypto.digest.HmacAlgorithm;
//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONObject;
//import com.gree.ecommerce.wxpay.enums.SignType;
//import com.gree.ecommerce.wxpay.model.v3.BuildAuthorizationParam;
//import com.gree.ecommerce.wxpay.util.aes.AesException;
//import com.gree.ecommerce.wxpay.util.aes.WXBizMsgCrypt;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.ResponseEntity;
//import org.springframework.util.ResourceUtils;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

//import javax.servlet.http.HttpServletRequest;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.security.cert.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.*;

/**
 * @author hawk
 * @package com.gree.ecommerce.wxpay.util
 * @desc 微信支付工具类
 * @date 2021/3/23
 */
//@Slf4j
public class WxPayUtil {
    private static final String FIELD_SIGN = "sign";
    private static final String FIELD_SIGN_TYPE = "sign_type";
    /**
     * 构建签名
     *
     * @param params       需要签名的参数
     * @param partnerKey   密钥
     * @param signType     签名类型
     * @param haveSignType 签名是否包含 sign_type 字段
     * @return 签名后的 Map
     */
//    public static Map<String, String> buildSign(Map<String, String> params, String partnerKey, SignType signType, boolean haveSignType) {
//        if (haveSignType) {
//            params.put(FIELD_SIGN_TYPE, signType.getType());
//        }
//        String sign = createSign(params, partnerKey, signType);
//        params.put(FIELD_SIGN, sign);
//        return params;
//    }
//
//    /**
//     * 生成签名
//     *
//     * @param params     需要签名的参数
//     * @param partnerKey 密钥
//     * @param signType   签名类型
//     * @return 签名后的数据
//     */
//    public static String createSign(Map<String, String> params, String partnerKey, SignType signType) {
//        if (signType == null) {
//            signType = SignType.MD5;
//        }
//        // 生成签名前先去除sign
//        params.remove(FIELD_SIGN);
//        String tempStr = WxPayUtil.createLinkString(params);
//        String stringSignTemp = tempStr + "&key=" + partnerKey;
//        if (signType == SignType.MD5) {
//            return md5(stringSignTemp).toUpperCase();
//        } else {
//            return hmacSha256(stringSignTemp, partnerKey).toUpperCase();
//        }
//    }
//
//    /**
//     * 把所有元素排序
//     *
//     * @param params 需要排序并参与字符拼接的参数组
//     * @return 拼接后字符串
//     */
//    public static String createLinkString(Map<String, String> params) {
//        return createLinkString(params, false);
//    }
//    /**
//     * @param params 需要排序并参与字符拼接的参数组
//     * @param encode 是否进行URLEncoder
//     * @return 拼接后字符串
//     */
//    public static String createLinkString(Map<String, String> params, boolean encode) {
//        return createLinkString(params, "&", encode);
//    }
//
//    /**
//     * @param params  需要排序并参与字符拼接的参数组
//     * @param connStr 连接符号
//     * @param encode  是否进行URLEncoder
//     * @return 拼接后字符串
//     */
//    public static String createLinkString(Map<String, String> params, String connStr, boolean encode) {
//        return createLinkString(params, connStr, encode, false);
//    }
//    public static String createLinkString(Map<String, String> params, String connStr, boolean encode, boolean quotes) {
//        List<String> keys = new ArrayList<>(params.keySet());
//        Collections.sort(keys);
//        StringBuilder content = new StringBuilder();
//        for (int i = 0; i < keys.size(); i++) {
//            String key = keys.get(i);
//            String value = params.get(key);
//            // 拼接时，不包括最后一个&字符
//            if (i == keys.size() - 1) {
//                if (quotes) {
//                    content.append(key).append("=").append('"').append(encode ? urlEncode(value) : value).append('"');
//                } else {
//                    content.append(key).append("=").append(encode ? urlEncode(value) : value);
//                }
//            } else {
//                if (quotes) {
//                    content.append(key).append("=").append('"').append(encode ? urlEncode(value) : value).append('"').append(connStr);
//                } else {
//                    content.append(key).append("=").append(encode ? urlEncode(value) : value).append(connStr);
//                }
//            }
//        }
//        return content.toString();
//    }
//    /**
//     * 生成16进制 MD5 字符串
//     *
//     * @param data 数据
//     * @return MD5 字符串
//     */
//    public static String md5(String data) {
//        return SecureUtil.md5(data);
//    }
//    /**
//     * 生成16进制的 sha256 字符串
//     *
//     * @param data 数据
//     * @param key  密钥
//     * @return sha256 字符串
//     */
//    public static String hmacSha256(String data, String key) {
//       return SecureUtil.hmac(HmacAlgorithm.HmacSHA256, key).digestHex(data, CharsetUtil.UTF_8);
//    }
//    /**
//     * URL 编码
//     *
//     * @param src 需要编码的字符串
//     * @return 编码后的字符串
//     */
//    public static String urlEncode(String src) {
//        try {
//            return URLEncoder.encode(src, CharsetUtil.UTF_8).replace("+", "%20");
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//
//    public static String buildAuthorization(BuildAuthorizationParam param) throws Exception {
//        String buildSignMessage = buildSignMessage(param.getMethod(), param.getUrlSuffix(), param.getTimestamp(), param.getNonceStr(), param.getBody());
//        String signature = createSign(buildSignMessage, param.getKeyPath());
//        return getAuthorization(param.getMchId(), param.getSerialNo(), param.getNonceStr(), String.valueOf(param.getTimestamp()), signature, param.getAuthType());
//    }
//
//    public static String buildSignMessage(RequestMethod method, String url, long timestamp, String nonceStr, String body) {
//        List<String> arrayList = new ArrayList<>(5);
//        arrayList.add(method.toString());
//        arrayList.add(url);
//        arrayList.add(String.valueOf(timestamp));
//        arrayList.add(nonceStr);
//        arrayList.add(body);
//        return buildSignMessage(arrayList);
//    }
//
//    public static String buildSignMessage(List<String> signMessage) {
//        if (signMessage != null && signMessage.size() > 0) {
//            StringBuilder sbf = new StringBuilder();
//
//            for (String str : signMessage) {
//                sbf.append(str).append("\n");
//            }
//
//            return sbf.toString();
//        } else {
//            return null;
//        }
//    }
//
//    public static String createSign(String signMessage, String keyPath) throws Exception {
//        if (StrUtil.isEmpty(signMessage)) {
//            return null;
//        } else {
//            PrivateKey privateKey = getPrivateKey(keyPath);
//            return encryptByPrivateKey(signMessage, privateKey);
//        }
//    }
//    /**
//     * 构建签名 Map
//     *
//     * @param partnerKey API KEY
//     * @param signType   {@link SignType} 签名类型
//     * @return 构建签名后的 Map
//     */
//    public Map<String, String> createSign(String partnerKey, SignType signType, Map<String, String> map) {
//        return createSign(partnerKey,signType,true,map);
//    }
//
//    /**
//     * 构建签名 Map
//     *
//     * @param partnerKey   API KEY
//     * @param signType     {@link SignType} 签名类型
//     * @param haveSignType 签名是否包含 sign_type 字段
//     * @return 构建签名后的 Map
//     */
//    public Map<String, String> createSign(String partnerKey, SignType signType, boolean haveSignType, Map<String, String> map) {
//        return WxPayUtil.buildSign(map, partnerKey, signType,haveSignType);
//    }
//
//    public static PrivateKey getPrivateKey(String keyPath) throws Exception {
//        String originalKey = FileUtil.readUtf8String(keyPath);
//        // InputStream in = WxPayUtil.class.getClassLoader().getResourceAsStream(keyPath);
//        // StringBuilder sb = new StringBuilder();
//        // byte[] buffer = new byte[in.available()];
//        // in.read(buffer);
//        // sb.append(new String(buffer));
//        // String originalKey = sb.toString();
//        String privateKey = originalKey.replace("-----BEGIN PRIVATE KEY-----", "").replace("-----END PRIVATE KEY-----", "").replaceAll("\\s+", "");
//        return loadPrivateKey(privateKey);
//    }
//
//    public static PrivateKey loadPrivateKey(String privateKeyStr) throws Exception {
//        try {
//            byte[] buffer = Base64.decode(privateKeyStr);
//            PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(buffer);
//            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
//            return keyFactory.generatePrivate(keySpec);
//        } catch (NoSuchAlgorithmException var4) {
//            throw new Exception("无此算法");
//        } catch (InvalidKeySpecException var5) {
//            throw new Exception("私钥非法");
//        } catch (NullPointerException var6) {
//            throw new Exception("私钥数据为空");
//        }
//    }
//
//    public static String encryptByPrivateKey(String data, PrivateKey privateKey) throws Exception {
//        Signature signature = Signature.getInstance("SHA256WithRSA");
//        signature.initSign(privateKey);
//        signature.update(data.getBytes(StandardCharsets.UTF_8));
//        byte[] signed = signature.sign();
//        return StrUtil.str(Base64.encode(signed));
//    }
//
//    public static String getAuthorization(String mchId, String serialNo, String nonceStr, String timestamp, String signature, String authType) {
//        Map<String, String> params = new HashMap<>(5);
//        params.put("mchid", mchId);
//        params.put("serial_no", serialNo);
//        params.put("nonce_str", nonceStr);
//        params.put("timestamp", timestamp);
//        params.put("signature", signature);
//        return authType.concat(" ").concat(createLinkString(params, ",", false, true));
//    }
//
//    /**
//     * 获取证书序列号
//     * @param inputStream
//     * @return
//     */
//    public static X509Certificate getCertificate(InputStream inputStream) {
//        try {
//            CertificateFactory cf = CertificateFactory.getInstance("X509");
//            X509Certificate cert = (X509Certificate)cf.generateCertificate(inputStream);
//            cert.checkValidity();
//            return cert;
//        } catch (CertificateExpiredException var3) {
//            throw new RuntimeException("证书已过期", var3);
//        } catch (CertificateNotYetValidException var4) {
//            throw new RuntimeException("证书尚未生效", var4);
//        } catch (CertificateException var5) {
//            throw new RuntimeException("无效的证书", var5);
//        }
//    }
//
//    /**
//     * 解析HttpServletRequest
//     * @param request HttpServletRequest
//     * @return String
//     */
//    public static String readData(HttpServletRequest request) {
//        BufferedReader br = null;
//
//        try {
//            StringBuilder result = new StringBuilder();
//
//            String line;
//            for(br = request.getReader(); (line = br.readLine()) != null; result.append(line)) {
//                if (result.length() > 0) {
//                    result.append("\n");
//                }
//            }
//
//            line = result.toString();
//            return line;
//        } catch (IOException var12) {
//            throw new RuntimeException(var12);
//        } finally {
//            if (br != null) {
//                try {
//                    br.close();
//                } catch (IOException var11) {
//                    var11.printStackTrace();
//                }
//            }
//
//        }
//    }
//
//    /**
//     * 异步通知验证签名
//     * @param serialNo 证书序列号
//     * @param body http返回体
//     * @param signature 签名结果
//     * @param nonce 随机字符串
//     * @param timestamp 时间戳
//     * @param key 公钥
//     * @param certPath 证书路径
//     * @return String
//     * @throws Exception
//     */
//    public static String verifyNotify(String serialNo, String body, String signature, String nonce, String timestamp, String key, String certPath) throws Exception {
////        log.info("WxPayUtil verifyNotify start[] params serialNo: {}, body: {}, signature: {}, nonce: {}, timestamp: {}, apiV3Key: {}, certPath: {}",
////                serialNo, body, signature, nonce, timestamp, key, certPath);
//        File file = ResourceUtils.getFile(certPath);
//        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(file));
//        X509Certificate certificate = WxPayUtil.getCertificate(inputStream);
//        String serialNumber = certificate.getSerialNumber().toString(16).toUpperCase();
////        log.info("serial number from cert is: {}", serialNumber);
//        if (serialNumber.equals(serialNo)) {
//            boolean verifySignature = verifySignature(signature, body, nonce, timestamp, certificate.getPublicKey());
//            if (verifySignature) {
//                JSONObject resultObject = JSON.parseObject(body);
//                JSONObject resource = resultObject.getJSONObject("resource");
//                String cipherText = resource.getString("ciphertext");
//                String nonceStr = resource.getString("nonce");
//                String associatedData = resource.getString("associated_data");
//                AesUtil aesUtil = new AesUtil(key.getBytes(StandardCharsets.UTF_8));
//                return aesUtil.decryptToString(associatedData.getBytes(StandardCharsets.UTF_8), nonceStr.getBytes(StandardCharsets.UTF_8), cipherText);
//            }
//        }
//
//        return null;
//    }
//
//    public static boolean verifySignature(String signature, String body, String nonce, String timestamp, PublicKey publicKey) throws Exception {
//        String buildSignMessage = WxPayUtil.buildSignMessage(timestamp, nonce, body);
//        return checkByPublicKey(buildSignMessage, signature, publicKey);
//    }
//
//    public static String buildSignMessage(String timestamp, String nonceStr, String body) {
//        ArrayList<String> arrayList = new ArrayList(3);
//        arrayList.add(timestamp);
//        arrayList.add(nonceStr);
//        arrayList.add(body);
//        return buildSignMessage(arrayList);
//    }
//
//    public static boolean checkByPublicKey(String data, String sign, PublicKey publicKey) throws Exception {
//        if (data == null || data.isEmpty()) {
//            return false;
//        }
//        Signature signature = Signature.getInstance("SHA256WithRSA");
//        signature.initVerify(publicKey);
//        signature.update(data.getBytes(StandardCharsets.UTF_8));
//        return signature.verify(Base64.decode(sign.getBytes(StandardCharsets.UTF_8)));
//    }
//
//    public static boolean verifySignature(ResponseEntity<Object> response, String certPath) throws Exception {
//        HttpHeaders responseHeaders = response.getHeaders();
//        String timestamp = responseHeaders.getFirst("Wechatpay-Timestamp");
//        String nonceStr = responseHeaders.getFirst("Wechatpay-Nonce");
//        String signature = responseHeaders.getFirst("Wechatpay-Signature");
//        LinkedHashMap<String, String> responseBody = (LinkedHashMap<String, String>)response.getBody();
//        String body = JSON.toJSONString(responseBody);
//        File file = ResourceUtils.getFile(certPath);
//        return verifySignature(signature, body, nonceStr, timestamp, FileUtil.getInputStream(file));
//    }
//    /**
//     * 验证签名
//     *
//     * @param signature       待验证的签名
//     * @param body            应答主体
//     * @param nonce           随机串
//     * @param timestamp       时间戳
//     * @param certInputStream 微信支付平台证书输入流
//     * @return 签名结果
//     * @throws Exception 异常信息
//     */
//    public static boolean verifySignature(String signature, String body, String nonce, String timestamp, InputStream certInputStream) throws Exception {
//        String buildSignMessage = WxPayUtil.buildSignMessage(timestamp, nonce, body);
//        // 获取证书
//        X509Certificate certificate = WxPayUtil.getCertificate(certInputStream);
//        PublicKey publicKey = certificate.getPublicKey();
//        return WxPayUtil.checkByPublicKey(buildSignMessage, signature, publicKey);
//    }
//    /**
//     * JS 调起支付签名
//     *
//     * @param appId    应用编号
//     * @param prepayId 预付订单号
//     * @param keyPath  key.pem 证书路径
//     * @return 唤起支付需要的参数
//     * @throws Exception 错误信息
//     */
//    public static Map<String, String> jsApiCreateSign(String appId, String prepayId, String keyPath) throws Exception {
//        String timeStamp = String.valueOf(System.currentTimeMillis() / 1000);
//        String nonceStr = String.valueOf(System.currentTimeMillis());
//        String packageStr = "prepay_id=" + prepayId;
//        Map<String, String> packageParams = new HashMap<>(6);
//        packageParams.put("appId", appId);
//        packageParams.put("timeStamp", timeStamp);
//        packageParams.put("nonceStr", nonceStr);
//        packageParams.put("package", packageStr);
//        packageParams.put("signType", SignType.RSA.toString());
//        ArrayList<String> list = new ArrayList<>();
//        list.add(appId);
//        list.add(timeStamp);
//        list.add(nonceStr);
//        list.add(packageStr);
//        String packageSign = WxPayUtil.createSign(
//                WxPayUtil.buildSignMessage(list),
//                keyPath
//        );
//        packageParams.put("paySign", packageSign);
//        return packageParams;
//    }
//
//    /**
//     * App 调起支付签名
//     *
//     * @param appId     应用编号
//     * @param partnerId 商户编号
//     * @param prepayId  预付订单号
//     * @param keyPath   key.pem 证书路径
//     * @return 唤起支付需要的参数
//     * @throws Exception 错误信息
//     */
//    public static Map<String, String> appCreateSign(String appId, String partnerId, String prepayId, String keyPath) throws Exception {
//        String timeStamp = String.valueOf(System.currentTimeMillis() / 1000);
//        String nonceStr = String.valueOf(System.currentTimeMillis());
//        Map<String, String> packageParams = new HashMap<>(8);
//        packageParams.put("appId", appId);
//        packageParams.put("partnerid", partnerId);
//        packageParams.put("prepayid", prepayId);
//        packageParams.put("package", "Sign=WXPay");
//        packageParams.put("timeStamp", timeStamp);
//        packageParams.put("nonceStr", nonceStr);
//        packageParams.put("signType", SignType.RSA.toString());
//        ArrayList<String> list = new ArrayList<>();
//        list.add(appId);
//        list.add(timeStamp);
//        list.add(nonceStr);
//        list.add(prepayId);
//        String packageSign = WxPayUtil.createSign(
//                WxPayUtil.buildSignMessage(list),
//                keyPath
//        );
//        packageParams.put("sign", packageSign);
//        return packageParams;
//    }
    //
    // /**
    //  * 订单查询
    //  *
    //  * @param params 请求参数
    //  * @return {@link String} 请求返回的结果
    //  */
    // public static String orderQuery(Map<String, String> params) {
    //     return orderQuery(false, null, params);
    // }
    //
    //
    // /**
    //  * 订单查询
    //  *
    //  * @param isSandbox 是否是沙盒环境
    //  * @param params    请求参数
    //  * @return {@link String} 请求返回的结果
    //  */
    // public static String orderQuery(boolean isSandbox, WxDomain wxDomain, Map<String, String> params) {
    //     return execution(getReqUrl(WxApiType.ORDER_QUERY, wxDomain, isSandbox), params);
    // }
    // /**
    //  * 发起请求
    //  *
    //  * @param apiUrl 接口 URL
    //  * @param params 接口请求参数
    //  * @return {@link String} 请求返回的结果
    //  */
    // public static String execution(String apiUrl, Map<String, String> params) {
    //     return doPost(apiUrl, params);
    // }
    // public static String doPost(String url, Map<String, String> params) {
    //     return HttpKit.getDelegate().post(url, WxPayKit.toXml(params));
    // }
    //
    // /**
    //  * 获取接口请求的 URL
    //  *
    //  * @param wxApiType {@link WxApiType} 支付 API 接口枚举
    //  * @param wxDomain  {@link WxDomain} 支付 API 接口域名枚举
    //  * @param isSandBox 是否是沙箱环境
    //  * @return {@link String} 返回完整的接口请求URL
    //  */
    // public static String getReqUrl(WxApiType wxApiType, WxDomain wxDomain, boolean isSandBox) {
    //     if (wxDomain == null) {
    //         wxDomain = WxDomain.CHINA;
    //     }
    //     return wxDomain.getType()
    //             .concat(isSandBox ? WxApiType.SAND_BOX_NEW.getType() : "")
    //             .concat(wxApiType.getType());
    // }



    // 视频号
    /**
     * 检验消息的真实性，并且获取解密后的明文.
     * <ol>
     * 	<li>利用收到的密文生成安全签名，进行签名验证</li>
     * 	<li>若验证通过，则提取xml中的加密消息</li>
     * 	<li>对消息进行解密</li>
     * </ol>
     *
     * @param token 公众平台上，开发者设置的token
     * @param encodingAesKey 公众平台上，开发者设置的EncodingAESKey
     * @param appId 公众平台appid
     * @param timeStamp 时间戳，对应URL参数的timestamp
     * @param nonce 随机串，对应URL参数的nonce
     * @param miwen 密文
     * @return 解密后的原文
     * @throws AesException 执行失败，请查看该异常的错误码和具体的错误信息
     * @throws IOException
     * @throws SAXException
     * @throws ParserConfigurationException
     */
    public String decryptMsg(String token, String encodingAesKey, String appId, String timeStamp, String nonce, String miwen)
            throws AesException, IOException, SAXException, ParserConfigurationException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
        dbf.setFeature("http://xml.org/sax/features/external-general-entities", false);
        dbf.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
        dbf.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
        dbf.setXIncludeAware(false);
        dbf.setExpandEntityReferences(false);
        DocumentBuilder db = dbf.newDocumentBuilder();
        StringReader sr = new StringReader(miwen);
        InputSource is = new InputSource(sr);
        Document document = db.parse(is);
        Element root = document.getDocumentElement();
        NodeList nodelist1 = root.getElementsByTagName("Encrypt");
//        NodeList nodelist2 = root.getElementsByTagName("MsgSignature");
        String encrypt = nodelist1.item(0).getTextContent();
//        String msgSignature = nodelist2.item(0).getTextContent();
        String msgSignature = "c1579817e2fd5ed9607d35894f503296ba30722c";
        String format = "<xml><ToUserName><![CDATA[toUser]]></ToUserName><Encrypt><![CDATA[%1$s]]></Encrypt></xml>";
        String fromXML = String.format(format, encrypt);
        // 第三方收到公众号平台发送的消息
        WXBizMsgCrypt pc = new WXBizMsgCrypt(token, encodingAesKey, appId);
        String result2 = pc.decryptMsg(msgSignature, timeStamp, nonce, fromXML);
        System.out.println("解密后明文: " + result2);
        return result2;
    }

}
