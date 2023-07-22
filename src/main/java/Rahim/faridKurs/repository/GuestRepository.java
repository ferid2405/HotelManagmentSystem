package Rahim.faridKurs.repository;

import Rahim.faridKurs.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest,Integer> {
}
