package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.model.User;

public interface UserRepository extends JpaRepository<User,Integer> {
	User findByEmail(String email);
}
