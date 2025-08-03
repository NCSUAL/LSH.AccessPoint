package accesspoint.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {

    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        return http
            //httpRequest마다 권한 설정
            .authorizeHttpRequests(auth -> 
                auth.requestMatchers("/**").permitAll()
            )

            //JWT를 사용하기 때문에 formLogin 설정 해제
            .formLogin(setting -> setting.disable())

            //JWT를 사용하기 때문에 Basic 인증 설정 해제
            .httpBasic(setting -> setting.disable())

            .build();
    }

    @Bean
    BCryptPasswordEncoder BCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
