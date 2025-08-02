package accesspoint.filter;

import java.io.IOException;

import org.springframework.stereotype.Component;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class LoggingFilter implements jakarta.servlet.Filter{

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        
        log.info("[Lsh-GateWay]: url -> {}", ((HttpServletRequest)request).getRequestURL());

        chain.doFilter(request, response);
    }

}
