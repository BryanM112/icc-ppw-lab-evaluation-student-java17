package ec.edu.ups.icc.libraryevaluation.security.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import ec.edu.ups.icc.libraryevaluation.security.entities.RefreshTokenEntity;

public interface RefreshTokenRepository extends JpaRepository<RefreshTokenEntity, Long> {
    Optional<RefreshTokenEntity> findByTokenAndRevokedFalse(String token);
}
