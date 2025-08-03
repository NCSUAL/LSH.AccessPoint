package accesspoint.common.security;
import java.io.Serializable;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import accesspoint.domain.TestUser;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TestUserDetail implements UserDetails, Serializable{

    private static final long serialVersionUID = 12345673234L;

    private final TestUser testUser;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //AuthorityUtils.commaSeparatedStringToAuthorityList: 해당 Role을 콤마 규칙을 넣어 만들어줌.
        return AuthorityUtils.commaSeparatedStringToAuthorityList(testUser.getRole().getRole());
    }

    @Override
    public String getPassword() {
        return testUser.getPassword();
    }

    @Override
    public String getUsername() {
        return testUser.getName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
