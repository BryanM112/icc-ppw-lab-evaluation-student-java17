package ec.edu.ups.icc.libraryevaluation.security.dtos;

public record AuthResponseDto(String accessToken, String refreshToken, long expiresIn) {
}
