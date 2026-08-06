package ec.edu.ups.icc.libraryevaluation.users.mappers;

import java.util.Set;
import java.util.stream.Collectors;
import ec.edu.ups.icc.libraryevaluation.users.dtos.UserResponseDto;
import ec.edu.ups.icc.libraryevaluation.users.entities.UserEntity;

public final class UserMapper {
    private UserMapper() {
    }

    public static UserResponseDto toResponse(UserEntity entity) {
        Set<String> roles = entity.getRoles().stream().map(role -> role.getName().name()).collect(Collectors.toSet());

        return new UserResponseDto(
                entity.getId(),
                entity.getFullName(),
                entity.getEmail(),
                entity.getAge(),
                entity.isActive(),
            roles);
    }
}
