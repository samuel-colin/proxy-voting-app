package fr.akoubayo.proxyvotingapp.repository;

import fr.akoubayo.proxyvotingapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByMatricule(String matricule);
}
