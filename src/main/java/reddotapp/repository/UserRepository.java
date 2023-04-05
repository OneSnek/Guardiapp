package reddotapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import reddotapp.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    //stuff goes here
}