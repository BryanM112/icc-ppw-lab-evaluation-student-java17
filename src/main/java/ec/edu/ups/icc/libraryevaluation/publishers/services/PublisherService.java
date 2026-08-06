package ec.edu.ups.icc.libraryevaluation.publishers.services;

import java.util.List;
import ec.edu.ups.icc.libraryevaluation.publishers.dtos.PublisherResponseDto;

public interface PublisherService {
    List<PublisherResponseDto> findActiveByCountry(String country);
}
