package accesspoint.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import accesspoint.domain.config.JwtConfig;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final JwtConfig jwtConfig;

    @RequestMapping(value = "/test")
    public String test(){
        System.out.println(jwtConfig.getSecret());
        System.out.println(jwtConfig.getExpiration());
        return "test";
    }
    
}
