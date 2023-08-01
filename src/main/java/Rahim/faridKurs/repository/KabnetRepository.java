package Rahim.faridKurs.repository;

import Rahim.faridKurs.entity.Kabnet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public interface KabnetRepository extends JpaRepository<Kabnet,Integer> {
}
