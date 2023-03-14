package br.com.bicko.lavanderiaonline.persistence.repositories;

import br.com.bicko.lavanderiaonline.persistence.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Integer, User> {
}
