import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author 方希萌
 * @version 1.0
 * @description TODO
 * @package com.example.tacocloud
 * @date 2022/4/6
 */
public class BcryptTest {

    @Test
    public void encode() {
        StringBuilder stringBuilder = new StringBuilder()
                .append("0000202204060179107701") // orderItemId
                .append("46115616541237") // afterSaleId
                .append("3012022040601048226_a") // outTradeNo
                .append("5")// refundType
                .append("0.01"); // refundAmount
        String password = stringBuilder.toString();

//        String hashpw = BCrypt.hashpw(password, BCrypt.gensalt());
//        System.out.println("加密 password：" + password + "\n加密后：" + hashpw);
//        decode(hashpw);


        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String sign = encoder.encode(stringBuilder.toString());
        decode(password, sign);


    }

    @Test
    public void decode(String password, String sign) {
        System.out.println("解密 ：" + sign);
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        boolean matches = encoder.matches(password, sign);
        System.out.println("是否匹配：" + matches);

        boolean matchenot = encoder.matches("aaa", sign);
        System.out.println("错误签名是否匹配：" + matchenot);
    }

}
