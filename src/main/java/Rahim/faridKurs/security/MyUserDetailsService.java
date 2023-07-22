//package Rahim.faridKurs.security;
//
//import Rahim.faridKurs.entity.User;
//import Rahim.faridKurs.exception.UserNotFound;
//import Rahim.faridKurs.repository.UserRepository;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//public class MyUserDetailsService implements UserDetailsService {
//
//    private final UserRepository repository;
//
//    public MyUserDetailsService(UserRepository repository) {
//        this.repository = repository;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user1 = repository
//                .findUserByEmail(username)
//                .orElseThrow(() -> new UserNotFound("Istifadeci tapilmadi"));
//        return new MyUserDetails(user1);
//    }
//}
