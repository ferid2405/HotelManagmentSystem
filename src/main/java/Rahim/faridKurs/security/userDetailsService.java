package Rahim.faridKurs.security;

import Rahim.faridKurs.exception.UserNotFound;
import Rahim.faridKurs.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class userDetailsService implements UserDetailsService {
    private  final UserRepository repository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = (User) repository
                .findUserByEmail(username)
                .orElseThrow(() -> new UserNotFound("Istifadeci tapilmadi"));
        return new MyUserDetails(user);
    }
}
