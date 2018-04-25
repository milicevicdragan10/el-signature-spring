package com.dex.services;

import com.dex.model.User;
import com.dex.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findUserByCredentials(User user) {
        User userFromDb = userRepository.findByKorisnickoImeAndLozinka(user.getKorisnickoIme(),user.getLozinka());
        if(userFromDb==null){
            throw new RuntimeException("User not found!!!");
        }
        return userFromDb;
    }
}
