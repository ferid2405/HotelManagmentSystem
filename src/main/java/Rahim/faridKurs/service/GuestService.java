package Rahim.faridKurs.service;
import Rahim.faridKurs.dto.GuestRequest;
import Rahim.faridKurs.entity.Guest;


import java.util.List;

public interface GuestService  {
    List<Guest> getAll();
    Guest getById(Integer id);
    void save(GuestRequest guestRequest);
    void  delete(Integer id);
    void update(Integer id, GuestRequest request);
}
