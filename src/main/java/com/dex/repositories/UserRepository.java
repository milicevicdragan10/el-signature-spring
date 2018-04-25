package com.dex.repositories;


import com.dex.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{
    User findByKorisnickoImeAndLozinka(String korisnickoIme, String lozinka);
}
