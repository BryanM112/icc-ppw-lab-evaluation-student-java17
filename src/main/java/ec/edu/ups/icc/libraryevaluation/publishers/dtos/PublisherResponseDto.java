package ec.edu.ups.icc.libraryevaluation.publishers.dtos;

public record PublisherResponseDto(
        Long id,
        String name,
        String country,
        Boolean active) {
}
