package cat.itacademy.barcelonactiva.barcia.ainoha.s05.t02.n01.model.services.impl;

import cat.itacademy.barcelonactiva.barcia.ainoha.s05.t02.n01.model.repository.UserRepository;
import cat.itacademy.barcelonactiva.barcia.ainoha.s05.t02.n01.model.services.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public UserDetailsService userDetailsService() {
        return new UserDetailsService() {
            @Override
            public UserDetails loadUserByUsername(String username) {
                return userRepository.findByEmail(username)
                        .orElseThrow(() -> new UsernameNotFoundException("User not found"));
            }
        };
    }
}
