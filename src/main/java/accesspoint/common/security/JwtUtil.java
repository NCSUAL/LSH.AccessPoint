package accesspoint.common.security;

import java.nio.charset.StandardCharsets;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.stereotype.Component;

import accesspoint.domain.config.JwtConfig;

@Component
public class JwtUtil {
 
    /**
     * 암호화 및 복호화에 사용되는 비밀 키를 나타내는 인터페이스
     */
    private SecretKey secretKey;
    private final JwtConfig jwtConfig;

    public JwtUtil(final JwtConfig jwtConfig){
        this.jwtConfig = jwtConfig;
        /**
         * SecretKey 인터페이스를 구현하는 클래스로,
         * 바이트 배열 형태의 키 데이터와 알고리즘 이름을 받아 SecretKey 객체를 생성
         */
        secretKey = SecretKeySpec(
            jwtConfig.getSecret().getBytes(StandardCharsets.UTF_8),
            //개발 예정
        );
    }
}
