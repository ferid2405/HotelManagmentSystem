package Rahim.faridKurs.dto;

import java.util.List;

public record HotelPageResponse(

        List<HotelResponse> elements,
        long totalElements,
        int totalPages,
        boolean hasNext
) {
}
