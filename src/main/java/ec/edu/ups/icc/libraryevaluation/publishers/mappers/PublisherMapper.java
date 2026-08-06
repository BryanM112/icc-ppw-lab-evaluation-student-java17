package ec.edu.ups.icc.libraryevaluation.publishers.mappers;

import ec.edu.ups.icc.libraryevaluation.publishers.dtos.PublisherResponseDto;
import ec.edu.ups.icc.libraryevaluation.publishers.entities.PublisherEntity;

public final class PublisherMapper {
    private PublisherMapper() {
    }

    public static PublisherResponseDto toResponse(PublisherEntity entity) {
        return new PublisherResponseDto(
                entity.getId(),
                entity.getName(),
                entity.getCountry(),
                entity.isActive());
    }
}
