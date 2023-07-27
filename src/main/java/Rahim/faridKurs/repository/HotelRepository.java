package Rahim.faridKurs.repository;

import Rahim.faridKurs.entity.Hotel;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public interface HotelRepository extends JpaRepository<Hotel,Integer> {

}
