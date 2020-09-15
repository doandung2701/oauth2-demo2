package com.hust.buidoandung.oauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hust.buidoandung.oauth.entity.User;

@Transactional
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	User findByUsername(String username);
}
