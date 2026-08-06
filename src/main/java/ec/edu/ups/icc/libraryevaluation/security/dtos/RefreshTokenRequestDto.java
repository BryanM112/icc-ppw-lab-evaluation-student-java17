package ec.edu.ups.icc.libraryevaluation.security.dtos;

import jakarta.validation.constraints.NotBlank;

public record RefreshTokenRequestDto(@NotBlank String refreshToken) {
}
