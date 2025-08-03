package accesspoint.common.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import accesspoint.repository.TestUserRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class TestUserDetailService implements UserDetailsService{

    private final TestUserRepository testUserRepository;
    
    @Override
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
        return testUserRepository.findById(Long.parseLong(id))
                                 .orElseThrow(() -> new UnsupportedOperationException("현재 개발중입니다"))
                                 .ofUserDetail();
    }

}
