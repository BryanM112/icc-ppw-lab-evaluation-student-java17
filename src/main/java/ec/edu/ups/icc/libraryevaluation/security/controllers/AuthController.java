package ec.edu.ups.icc.libraryevaluation.security.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ec.edu.ups.icc.libraryevaluation.security.dtos.AuthResponseDto;
import ec.edu.ups.icc.libraryevaluation.security.dtos.LoginRequestDto;
import ec.edu.ups.icc.libraryevaluation.security.dtos.RefreshTokenRequestDto;
import ec.edu.ups.icc.libraryevaluation.security.services.AuthService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/auth")
@Tag(name = "Authentication", description = "Inicio de sesión y renovación de tokens")
public class AuthController {
    private final AuthService service;

    public AuthController(AuthService service) {
        this.service = service;
    }

    @PostMapping("/login")
    @Operation(summary = "Iniciar sesión")
    @ApiResponse(responseCode = "200", description = "Autenticación correcta")
    @ApiResponse(responseCode = "401", description = "Credenciales inválidas")
    public AuthResponseDto login(@Valid @RequestBody LoginRequestDto dto) {
        return service.login(dto);
    }

    @PostMapping("/refresh")
    @Operation(summary = "Renovar el access token")
    public AuthResponseDto refresh(@Valid @RequestBody RefreshTokenRequestDto dto) {
        return service.refresh(dto.refreshToken());
    }
}
