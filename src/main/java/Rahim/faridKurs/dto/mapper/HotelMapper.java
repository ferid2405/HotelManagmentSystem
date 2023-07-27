package Rahim.faridKurs.dto.mapper;

import Rahim.faridKurs.dto.HotelRequest;
import Rahim.faridKurs.dto.HotelResponse;
import Rahim.faridKurs.entity.Hotel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface HotelMapper {
    Hotel toHotel(HotelRequest hotelRequest);
    HotelResponse toHotelResponse(Hotel hotel);

}
