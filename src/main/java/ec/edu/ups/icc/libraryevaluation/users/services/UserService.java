package ec.edu.ups.icc.libraryevaluation.users.services;

import java.util.List;
import ec.edu.ups.icc.libraryevaluation.users.dtos.UserResponseDto;

public interface UserService {
    List<UserResponseDto> findActiveReaders(Integer minAge);
}
