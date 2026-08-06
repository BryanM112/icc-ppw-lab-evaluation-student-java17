package ec.edu.ups.icc.libraryevaluation.users.dtos;

import java.util.Set;

public record UserResponseDto(
                Long id,
                String fulName,
                String email,
                Integer age,
                Boolean active,
                Set<String> roles) {
}
