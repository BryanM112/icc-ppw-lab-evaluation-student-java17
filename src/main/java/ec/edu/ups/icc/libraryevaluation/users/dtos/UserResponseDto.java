package ec.edu.ups.icc.libraryevaluation.users.dtos;

import java.util.Set;

public record UserResponseDto(
                Long id,
                String name,
                String email,
                Integer age,
                Boolean active) {
}
