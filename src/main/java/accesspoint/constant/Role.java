package accesspoint.constant;

import lombok.Getter;

@Getter
public enum Role {

    ADMIN(Authority.ADMIN, "서버 관리자"),
    USER(Authority.USER,"사용자");
    private final String role;
    private final String description;

    Role(final String role, final String description){
        this.role = role;
        this.description = description;
    }


    public static class Authority{
        private final static String ADMIN = "ADMIN";
        private final static String USER = "ADMIN";
    }
}
