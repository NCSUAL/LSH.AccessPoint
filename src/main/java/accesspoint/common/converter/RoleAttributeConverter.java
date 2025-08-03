package accesspoint.common.converter;


import java.util.stream.Stream;

import org.springframework.stereotype.Component;

import accesspoint.constant.Role;
import jakarta.persistence.AttributeConverter;

@Component
public class RoleAttributeConverter implements AttributeConverter<Role, String>{
    @Override
    public String convertToDatabaseColumn(Role attribute) {
        return attribute.getRole();
    }

    @Override
    public Role convertToEntityAttribute(String dbData) {
        return  Stream.of(Role.values())
                .filter(role -> role.getRole().equalsIgnoreCase(dbData))
                .findAny()
                .orElseThrow(() -> new UnsupportedOperationException("추후에 개발할 예정입니다."));
    }

}
