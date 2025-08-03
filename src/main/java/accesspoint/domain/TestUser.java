package accesspoint.domain;

import accesspoint.common.converter.RoleAttributeConverter;
import accesspoint.common.security.TestUserDetail;
import accesspoint.constant.Role;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TEST_USER",schema = "user")
@Builder
@Getter
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TestUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(value = EnumType.STRING)
    @Convert(converter = RoleAttributeConverter.class)
    private Role role;
    
    private String password;

    private String name;

    private String email;

    private String etc;

    public TestUserDetail ofUserDetail(){
        return new TestUserDetail(this);
    }
}
