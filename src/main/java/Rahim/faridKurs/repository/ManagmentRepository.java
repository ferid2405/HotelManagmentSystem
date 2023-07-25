package Rahim.faridKurs.repository;

import Rahim.faridKurs.entity.Managment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public interface ManagmentRepository extends JpaRepository<Managment,Integer> {
}
