package accesspoint.common;

import lombok.Getter;

@Getter
public enum Role {

    ADMIN("ADMIN", "서버 관리자"),
    USER("USER","사용자");
    private final String role;
    private final String description;

    Role(final String role, final String description){
        this.role = role;
        this.description = description;
    }

}
